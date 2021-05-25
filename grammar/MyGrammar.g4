grammar MyGrammar;

inicio      : (function | estruct)* main (function | estruct)*;

estruct     : 'estructura' ID (declaration)* 'fin_estructura';

function        : 'funcion' type ID PIZQ parameters PDER 'hacer' comands return 'fin_funcion';

return          : 'retornar' valor SMCOLON;

parameters     : type ID (',' type ID)*
                |
                ;

main            : 'funcion_principal' comands 'fin_principal';

comands         : comand comands
                |
                ;

comand          : read
                | print
                | declaration
                | asignacion_id
                | if
                | func_id
                | while
                | do_while
                | for
                | switch
                | 'romper'
                ;

read            : 'leer' PIZQ idr PDER SMCOLON;
idr             : ID ('.'ID)*;

print           : 'imprimir' PIZQ print_ PDER SMCOLON;
print_          : valor (',' valor)*;


id              : ID ('.'ID)* call_function;

call_function   : PIZQ (valor (',' valor)*)? PDER
                |
                ;

declaration         : type ID asignacion (',' ID asignacion)* ';' ;

asignacion          : '=' valor
                    | ;

asignacion_id       : id_pos_estruct '=' valor SMCOLON;

id_pos_estruct       : ID ('.' ID)* ; //id con posibilidad de ser estructura


valor           : PIZQ valor PDER
                | operador_neg valor
                | valor operador_binario valor
                | DOUBLE
                | INT
                | CARACTER
                | STRING
                | id
                | BOOLEANO
                ;

if              : 'si' PIZQ valor (RIP valor)* PDER 'entonces' comands else 'fin_si';

else            : 'si_no' comands
                |
                ;

func_id         : ID PIZQ par_fun PDER SMCOLON;
par_fun         : valor (',' valor)*
                |
                ;

while           : 'mientras' PIZQ valor PDER 'hacer' comands 'fin_mientras';

do_while        : 'hacer' comands 'mientras' PIZQ valor PDER SMCOLON;

for             : 'para' PIZQ declaration valor SMCOLON valor PDER 'hacer' comands 'fin_para';

switch          : 'seleccionar' PIZQ id PDER 'entre' casos 'fin_seleccionar';

casos           : 'caso' valor ':' comands (romper)? casos
                | 'defecto' ':' comands (romper)?
                |
                ;

romper          : 'romper' ';';

type            : ID
                | primitive
                ;

operador_binario    : '+'
                    | '-'
                    | '*'
                    | '/'
                    | '<'
                    | '<='
                    | '>='
                    | '>'
                    | '=='
                    | '!='
                    | '&&'
                    | '||'
                    | '%'
                    ;

operador_neg        : '-'
                    | '!'
                    ;

primitive       : 'booleano'
                | 'caracter'
                | 'entero'
                | 'real'
                | 'cadena'
                ;

//Lexer
COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
WS		: [ \t\r\n]+ -> skip ;
VAR		: 'var';
SET		: 'set';
PIZQ	: '(' ;
PDER	: ')' ;
ROP		: ( '<' | '<=' | '>=' | '>' | '==' | '!=' ) ;
RIP     : ( '&&' | '||');
SMCOLON : ';' ;
COLON : ',' ;
MULOP	: ( '*' | '/' );
SUMOP	: '+' | '-';
DOUBLE	: [0-9]+( | [.][0-9]+);
INT     : [0-9]+;
STRING  : '"' .*? '"';
CARACTER  : '\''[a-zA-Z]'\'';
BOOLEANO : ('verdadero' | 'falso');
ID 		: [a-zA-Z][a-zA-Z0-9_]* ;