grammar Rose;

//parser rules
program: PROCEDURE ID IS DECLARE 
	{System.out.println("\t" + ".data");}
	variables BEGIN 
	{System.out.println("\t" + ".text");
	System.out.println("main:");}
	statements[0, 1] END SEMICOLON;

variables: variable variables
	| 
	;
variable: ID COLON INTEGER SEMICOLON
	{System.out.println($ID.text + ": " + ".word 0");}
	;

statements [int reg, int label] returns [int nreg, int nlabel]
	: statement[$reg, $label] statements[$statement.nreg, $statement.nlabel] {
		$nreg = $statements.nreg; $nlabel = $statements.nlabel;
	}
	| {
		// System.out.println("no more statements, reg = \$t" + $reg); 
		$nreg = $reg; $nlabel = $label;
	}
	;
statement [int reg, int label] returns [int nreg, int nlabel]
	: assignment_statement[$reg] {
		$nreg = $assignment_statement.nreg; $nlabel = $label;
	}
	| if_statement[$reg, $label] {
		$nreg = $if_statement.nreg; 
		$nlabel = $if_statement.nlabel;
	}
	// | for_statement
	| exit_statement {
		$nreg = $reg;
		$nlabel = $label;
	}
	| read_statement[$reg] {
		$nreg = $read_statement.nreg;
		$nlabel = $label;
	}
	| write_statement[$reg] {
		$nreg = $write_statement.nreg;
		$nlabel = $label;
	}
	;

assignment_statement [int reg] returns [int nreg]
	: ID ASSIGNMENT arith_expression[$reg] SEMICOLON
	{System.out.println("\t" + "la \$t" + $arith_expression.nreg + ", " + $ID.text);
	System.out.println("\t" + "sw \$t" + $arith_expression.place + ", " + "0(\$t" + $arith_expression.nreg +")" );
	$nreg = $arith_expression.nreg - 1;}
	;

if_statement [int reg, int label] 
	returns [int nreg, int nlabel, int temp_B_true, int temp_B_false, int temp_L_to_next]
	: IF bool_expression[$reg, $label, $label+1, $label+3] {
		$temp_B_true = $label; 
		$temp_B_false = $label+1; 
		$temp_L_to_next = $label+2;
	} 
	THEN {
		System.out.println("L" + $temp_B_true + ":");
	} statements [$bool_expression.nreg, $bool_expression.nlabel] 
	if_statement_ [$statements.nreg, $statements.nlabel, $temp_L_to_next, $temp_B_false] {
		$nreg = $if_statement_.nreg; 
		$nlabel = $if_statement_.nlabel;
	};

if_statement_ [int reg, int label, int L_to_next, int B_false] 
	returns [int nreg, int nlabel]
	: END IF SEMICOLON {
		System.out.println("L" + $B_false + ":"); 
		$nreg = $reg; 
		$nlabel = $label;
	}
	| ELSE {
		System.out.println("\t" + "b L" + $L_to_next); 
		System.out.println("L" + $B_false + ":");
	} 
	statements[$reg, $label] {
		System.out.println("L" + $L_to_next + ":"); 
		$nreg = $statements.nreg; 
		$nlabel = $statements.nlabel;
	} END IF SEMICOLON
	;

// for_statement: FOR ID IN arith_expression RANGE arith_expression LOOP statements END LOOP SEMICOLON;
exit_statement: EXIT SEMICOLON {
	System.out.println("\t" + "li \$v0, 10");
	System.out.println("\t" + "syscall");
	};
read_statement [int reg] returns [int nreg]
	: READ ID SEMICOLON {
	System.out.println("\t" + "li \$v0, 5");
	System.out.println("\t" + "syscall");
	System.out.println("\t" + "la \$t" + $reg + ", " + $ID.text);
	System.out.println("\t" + "sw \$v0, 0(\$t" + $reg + ")");
	$nreg = $reg;
	};

write_statement [int reg] returns [int nreg]
	: WRITE arith_expression[$reg] SEMICOLON {
		System.out.println("\t" + "move \$a0, \$t" + $arith_expression.place);
		System.out.println("\t" + "li \$v0, 1");
		System.out.println("\t" + "syscall");
		$nreg = $arith_expression.nreg-1;
	};

bool_expression [int reg, int B_true, int B_false, int label] 
	returns [int nreg, int nlabel]
 	: bool_term[$reg, $B_true, $B_false, $label] 
	bool_expression_[$bool_term.nreg, $B_true, $B_false, $bool_term.nlabel, $bool_term.n_E1_place, $bool_term.n_E2_place, $bool_term.n_operation, $bool_term.n_f_not]
	{
		$nreg = $bool_expression_.nreg;
		$nlabel = $bool_expression_.nlabel;
	};

bool_expression_ [int reg, int B_true, int B_false, int label, int E1_place, int E2_place, int operation, int f_not] 
	returns [int nreg, int nlabel, int temp_B_true, int temp_B_false]
	: {
		$temp_B_false = $label;
		$temp_B_true = $B_true;
		if ($f_not == 1)
		{
			$temp_B_true = $label;
			$temp_B_false = $B_true;
		}
		$label++;
		switch ($operation){
		case 0:
			System.out.println("\t" + "beq \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		case 1:
			System.out.println("error: angle bracket case");
			break;
		case 2:
			System.out.println("\t" + "bgt \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		case 3:
			System.out.println("\t" + "bge \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		case 4:
			System.out.println("\t" + "blt \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		case 5:
			System.out.println("\t" + "ble \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		default:
			System.out.println("error: switch to default");
		}
		System.out.println("\t" + "b L" + $temp_B_false);
		$reg -= 2;
	}
	OR {
		System.out.println("L" + $temp_B_false + ":");
	}
	bool_term[$reg, $B_true, $B_false, $label] 
	bool_expression_[$bool_term.nreg, $B_true, $B_false, $bool_term.nlabel, $bool_term.n_E1_place, $bool_term.n_E2_place, $bool_term.n_operation, $bool_term.n_f_not]
	| 
	{
		$temp_B_false = $B_false;
		$temp_B_true = $B_true;
		if ($f_not == 1)
		{
			$temp_B_true = $B_false;
			$temp_B_false = $B_true;
		}
		switch ($operation){
		case 0:
			System.out.println("\t" + "beq \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		case 1:
			System.out.println("error: angle bracket case");
			break;
		case 2:
			System.out.println("\t" + "bgt \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		case 3:
			System.out.println("\t" + "bge \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		case 4:
			System.out.println("\t" + "blt \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		case 5:
			System.out.println("\t" + "ble \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
			break;
		default:
			System.out.println("error: switch to default");
		}
		System.out.println("\t" + "b L" + $temp_B_false);
		$reg -= 2;

		$nreg = $reg;
		$nlabel = $label;
	}
	;

bool_term [int reg, int B_true, int B_false, int label] 
	returns [int nreg, int nlabel, int n_E1_place, int n_E2_place, int n_operation, int n_f_not]
	: bool_factor[$reg]  bool_term_[$bool_factor.nreg, $B_true, $B_false, $label, $bool_factor.n_E1_place, $bool_factor.n_E2_place, $bool_factor.n_operation, $bool_factor.n_f_not] {
		$nreg = $bool_term_.nreg;
		$nlabel = $bool_term_.nlabel;
		$n_E1_place = $bool_term_.n_E1_place;
		$n_E2_place = $bool_term_.n_E2_place;
		$n_operation = $bool_term_.n_operation;
		$n_f_not = $bool_term_.n_f_not;
	};

bool_term_ [int reg, int B_true, int B_false, int label, int E1_place, int E2_place, int operation, int f_not] 
	returns [int nreg, int nlabel, int n_E1_place, int n_E2_place, int n_operation, int n_f_not, int temp_B_true, int temp_B_false]
	: {
		$temp_B_true = $label;
		$temp_B_false = $B_false;
		if ($f_not == 1)
		{
			$temp_B_true = $B_false;
			$temp_B_false = $label;
		}
		$label++;
		switch ($operation){
			case 0:
				System.out.println("\t" + "beq \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
				break;
			case 1:
				System.out.println("error: angle bracket case");
				break;
			case 2:
				System.out.println("\t" + "bgt \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
				break;
			case 3:
				System.out.println("\t" + "bge \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
				break;
			case 4:
				System.out.println("\t" + "blt \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
				break;
			case 5:
				System.out.println("\t" + "ble \$t" + $E1_place + ", \$t" + $E2_place + ", " + "L" + $temp_B_true);
				break;
			default:
				System.out.println("error: switch to default");
	}
	System.out.println("\t" + "b L" + $temp_B_false);
	$reg -= 2;
	}
	AND {
		System.out.println("L" + $temp_B_true + ":");
	} 
	bool_factor[$reg] bool_term_[$bool_factor.nreg, $B_true, $B_false, $label, $bool_factor.n_E1_place, $bool_factor.n_E2_place, $bool_factor.n_operation, $bool_factor.n_f_not]
	
	| {
		$nreg = $reg;
		$nlabel = $label;
		$n_E1_place = $E1_place;
		$n_E2_place = $E2_place;
		$n_operation = $operation;
		$n_f_not = $f_not;
	}
	;

bool_factor [int reg] 
	returns [int nreg, int n_E1_place, int n_E2_place, int n_operation, int n_f_not]
	: NOT bool_primary[$reg] {
		$nreg = $bool_primary.nreg; 
		$n_E1_place = $bool_primary.n_E1_place; 
		$n_E2_place = $bool_primary.n_E2_place; 
		$n_operation = $bool_primary.n_operation; 
		$n_f_not = 1;
	}
	| bool_primary[$reg] {
		$nreg = $bool_primary.nreg; 
		$n_E1_place = $bool_primary.n_E1_place; 
		$n_E2_place = $bool_primary.n_E2_place; 
		$n_operation = $bool_primary.n_operation; 
		$n_f_not = 0;
	}
	;

bool_primary [int reg] returns [int nreg, int n_E1_place, int n_E2_place, int n_operation]
	: E1=arith_expression[$reg] relation_op E2=arith_expression[$E1.nreg] {
		$nreg = $E2.nreg; 
		$n_E1_place = $E1.place; 
		$n_E2_place = $E2.place; 
		$n_operation = $relation_op.operation;
	}
	;

relation_op returns [int operation]
	: EQUAL {$operation = 0;}
	| ANGLE_BRACKETS {$operation = 1;}
	| GREATER_THAN {$operation = 2;}
	| GREATER_THAN_OR_EQUAL {$operation = 3;}
	| LESS_THAN {$operation = 4;}
	| LESS_THAN_OR_EQUAL {$operation = 5;}
	;

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
