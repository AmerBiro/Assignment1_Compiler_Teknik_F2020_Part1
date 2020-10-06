grammar simpleCalc;

start   : expr EOF;

// Rules
expr : 
       c=NUMBER                              # NUMBER
     | e1=expr '^'  e2=expr          # POWER
     | 'sqrt('  e1=expr   ')'                      # SQRT        
     | e1=expr op=('*' | '/') e2=expr         # MULTI_DEVI
     | e1=expr op=('+' | '-') e2=expr         # ADD_SUB
     | op=('+' | '-') e=expr                  # Minus
     | '(' e=expr ')'      # PARENTHESES
     ;


NUMBER              : [0-9]+ ('.' [0-9]+)? ;
WHITESPACES         : [ \t\n\r]+ -> skip ;
COMMENT             : ('//' (~[\n])*) -> skip ;
MULTILINECOMMENTS   :  ( '/*'  (( '*'~[/] | ~[*]  )*) '*/') -> skip; 
