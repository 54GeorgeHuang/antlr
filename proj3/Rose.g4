grammar Rose;

//parser rules
program: PROCEDURE ID IS DECLARE 
	{System.out.println("\t" + ".data");}
	variables BEGIN 
	{System.out.println("\t" + ".text");
	System.out.println("main:");}
	statements[0] END SEMICOLON;

variables: variable variables
	| 
	;
variable: ID COLON INTEGER SEMICOLON
	{System.out.println($ID.text + ": " + ".word 0");}
	;

statements [int reg]
	: statement[$reg] statements[$statement.nreg]
	| {System.out.println("no more statements, reg = \$t" + $reg);}
	;
statement [int reg] returns [int nreg]
	: assignment_statement[$reg] {$nreg = $assignment_statement.nreg;}
	// | if_statement
	// | for_statement
	// | exit_statement
	| read_statement
	| write_statement[$reg]
	;

assignment_statement [int reg] returns [int nreg]
	: ID ASSIGNMENT arith_expression[$reg] SEMICOLON
	{System.out.println("\t" + "la \$t" + $arith_expression.nreg + ", " + $ID.text);
	System.out.println("\t" + "sw \$t" + $arith_expression.place + ", " + "0(\$t" + $arith_expression.nreg +")" );
	$nreg = $arith_expression.nreg - 1;}
	;

// if_statement: IF bool_expression THEN statements if_statement_;
// if_statement_: END IF SEMICOLON
// 	| ELSE statements END IF SEMICOLON
// 	;

// for_statement: FOR ID IN arith_expression RANGE arith_expression LOOP statements END LOOP SEMICOLON;
// exit_statement: EXIT SEMICOLON;
read_statement: READ ID SEMICOLON
	{System.out.println("\t" + "li \$v0, 5");
	System.out.println("\t" + "syscall");};

write_statement [int reg] returns [int nreg]
	: WRITE arith_expression[$reg] SEMICOLON
	{System.out.println("\t" + "move \$a0, \$t" + $arith_expression.place);
	System.out.println("\t" + "li \$v0, 1");
	System.out.println("\t" + "syscall");
	$nreg = $arith_expression.nreg-1;};

// bool_expression: bool_term bool_expression_;
// bool_expression_: OR bool_term bool_expression_
// 	|
// 	;

// bool_term: bool_factor bool_term_;
// bool_term_: AND bool_factor bool_term_
// 	|
// 	;

// bool_factor: NOT bool_primary
// 	| bool_primary
// 	;
// bool_primary: arith_expression relation_op arith_expression;

// relation_op: EQUAL
// 	| ANGLE_BRACKETS
// 	| GREATER_THAN
// 	| GREATER_THAN_OR_EQUAL
// 	| LESS_THAN
// 	| LESS_THAN_OR_EQUAL
// 	;

arith_expression [int reg] returns [int nreg, int place]
	: arith_term[$reg] arith_expression_[$arith_term.nreg, $arith_term.place]
	{$nreg = $arith_expression_.nreg; $place = $arith_expression_.place;};
	
arith_expression_ [int reg, int notMyPlace] returns [int nreg, int place]
	: ADD arith_term[$reg] 
	{System.out.println("\t" + "add \$t" + $notMyPlace + ", \$t" + $notMyPlace + ", \$t" + $arith_term.place);
	$place = $notMyPlace; $nreg = $arith_term.nreg-1;}
	arith_expression_[$nreg, $place]

	| MINUS arith_term[$reg] 
	{System.out.println("\t" + "sub \$t" + $notMyPlace + ", \$t" + $notMyPlace + ", \$t" + $arith_term.place);
	$place = $notMyPlace; $nreg = $arith_term.nreg-1;}
	arith_expression_[$nreg, $place]

	| {$nreg = $reg; $place = $notMyPlace;}
	;

arith_term [int reg] returns [int nreg, int place]
	: arith_factor[$reg] arith_term_[$arith_factor.nreg, $arith_factor.place]
	{$nreg = $arith_term_.nreg; $place = $arith_term_.place;};

arith_term_ [int reg, int notMyPlace] returns [int nreg, int place]
	: MULTIPLY arith_factor[$reg] 
	{System.out.println("\t" + "mul \$t" + $notMyPlace + ", \$t" + $notMyPlace + ", \$t" + $arith_factor.place);
	$place = $notMyPlace; $nreg = $arith_factor.nreg-1;}
	arith_term_[$nreg, $place]

	| DIVISION arith_factor[$reg] 
	{System.out.println("\t" + "div \$t" + $notMyPlace + ", \$t" + $notMyPlace + ", \$t" + $arith_factor.place);
	$place = $notMyPlace; $nreg = $arith_factor.nreg-1;}
	arith_term_[$nreg, $place]

	| MOD arith_factor[$reg] 
	{System.out.println("\t" + "rem \$t" + $notMyPlace + ", \$t" + $notMyPlace + ", \$t" + $arith_factor.place);
	$place = $notMyPlace; $nreg = $arith_factor.nreg-1;}
	arith_term_[$nreg, $place]

	| {$nreg = $reg; $place = $notMyPlace;}
	;

arith_factor [int reg] returns [int nreg, int place]
	: MINUS arith_primary[$reg]
	{System.out.println("\t" + "neg \$t" + $arith_primary.place + ", \$t" + $arith_primary.place);
	$place = $arith_primary.place; $nreg = $arith_primary.nreg;}
	| arith_primary[$reg] {$place = $arith_primary.place; $nreg = $arith_primary.nreg;}
	;

arith_primary [int reg] returns [int nreg, int place]
	: CONST_INT
	{System.out.println("\t" + "li \$t" + $reg + ", " + $CONST_INT.text);
	$place = $reg; $nreg = $reg + 1;}
	| ID
	{System.out.println("\t" + "la \$t" + $reg + ", " + $ID.text);
	System.out.println("\t" + "lw \$t" + $reg + ", " + "0(\$t" + $reg + ")");
	$place = $reg; $nreg = $reg+1;}
	| LEFT_PARENTHESES arith_expression[$reg] RIGHT_PARENTHESES
	{$place = $arith_expression.place; $nreg = $arith_expression.nreg;}
	;


//lexer rules
COMMENTS: '//'.*?'\n' -> skip;
WHITESPACE:(' '|'\t'|'\r'|'\n')+ -> skip;

//keywords
BEGIN: 'begin';
DECLARE: 'declare';
ELSE: 'else';
END: 'end';
EXIT: 'exit';
FOR: 'for';
IF: 'if';
IN: 'in';
INTEGER: 'integer';
IS: 'is';
LOOP: 'loop';
PROCEDURE: 'procedure';
READ: 'read';
THEN: 'then';
WRITE: 'write';

//operators
COLON: ':';
RANGE: '..';
SEMICOLON: ';';
ADD: '+';
MINUS: '-';
MULTIPLY: '*';
DIVISION: '/';
MOD: '%';
EQUAL: '=';
ANGLE_BRACKETS: '<>';
GREATER_THAN: '>';
GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN: '<';
LESS_THAN_OR_EQUAL: '<=';
AND: '&&';
OR: '||';
NOT: '!';
ASSIGNMENT: ':=';
LEFT_PARENTHESES: '(';
RIGHT_PARENTHESES: ')';

//ID & const
fragment UPPER_LETTER: [A-Z];
fragment DIGIT: [0-9];
fragment UNDERSCORE: '_';
ID:(UPPER_LETTER|UNDERSCORE)(UPPER_LETTER|DIGIT|UNDERSCORE)*;

CONST_INT: '0'|[1-9][0-9]*;
