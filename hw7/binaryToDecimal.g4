grammar binaryToDecimal;

program: s	{System.out.println($s.val);}
	;
s returns [float val]
	: l '.' r	{$val = (float)$l.val + $r.val;}
	;
l returns [int val]
	: b ls[$b.val]	{$val = $ls.val;}
	;
ls [int in] returns [int val]
	: b ls [$in*2 + $b.val]	{$val = $ls.val;}
	|	{$val = $in;}
	;
r returns [float val]
	: b rs	{$val = (float)$b.val/2 + $rs.val/2;}
	;
rs returns [float val]
	: b rs	{$val = (float)$b.val/2 + $rs.val/2;}
	|	{$val = 0;}
	;
b returns [int val]
	: '0' {$val = 0;}
	| '1' {$val = 1;}
	;