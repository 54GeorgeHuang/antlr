grammar Rose;

//parser rules
program: PROCEDURE ID IS DECLARE variables BEGIN statements END SEMICOLON;

variables: variable variables
	| 
	;
variable: ID COLON INTEGER SEMICOLON;

statements: statement statements
	|
	;
statement: assignment_statement
	| if_statement
	| for_statement
	| exit_statement
	| read_statement
	| write_statement
	;

assignment_statement: ID ASSIGNMENT arith_expression SEMICOLON;

if_statement: IF bool_expression THEN statements if_statement_;
if_statement_: END IF SEMICOLON
	| ELSE statements END IF SEMICOLON
	;

for_statement: FOR ID IN arith_expression RANGE arith_expression LOOP statements END LOOP SEMICOLON;
exit_statement: EXIT SEMICOLON;
read_statement: READ ID SEMICOLON;
write_statement: WRITE arith_expression SEMICOLON;

bool_expression: bool_term bool_expression_;
bool_expression_: OR bool_term bool_expression_
	|
	;

bool_term: bool_factor bool_term_;
bool_term_: AND bool_factor bool_term_
	|
	;

bool_factor: NOT bool_primary
	| bool_primary
	;
bool_primary: arith_expression relation_op arith_expression;

relation_op: EQUAL
	| LESS_THAN relation_op_
	| GREATER_THAN relation_op__
	;
relation_op_: GREATER_THAN
	| EQUAL
	|
	;
relation_op__: EQUAL
	|
	;

arith_expression: arith_term arith_expression_;
arith_expression_: ADD arith_term arith_expression_
	| MINUS arith_term arith_expression_
	|
	;

arith_term: arith_factor arith_term_;
arith_term_: MULTIPLY arith_factor arith_term_
	| DIVISION arith_factor arith_term_
	| MOD arith_factor arith_term_
	|
	;

arith_factor: MINUS arith_primary
	| arith_primary
	;
arith_primary: CONST_INT
	| ID
	| LEFT_PARENTHESES arith_expression RIGHT_PARENTHESES
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
