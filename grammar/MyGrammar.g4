grammar MyGrammar;

inicio      : (funcion | estructura)* main (funcion | estructura)*;

estructura     : 'estructura' ID (declaration)* 'fin_estructura';

funcion        : 'funcion' type ID PIZQ parameters PDER 'hacer' comands retornar 'fin_funcion';

retornar          : 'retornar' valor SMCOLON;

parameters     : type ID (',' type ID)*
                |
                ;

main            : 'funcion_principal' comands 'fin_principal';

comands         : comand comands
                |
                ;

comand          : leer
                | imprimir
                | declaration
                | si
                | func_id
                | mientras
                | hacer_mientras
                | para
                | seleccionar
                | 'romper'
                ;

leer            : 'leer' PIZQ idr PDER SMCOLON;
idr             : ID ('.'ID)*;

imprimir           : 'imprimir' PIZQ imprimir_ PDER SMCOLON;
imprimir_          : valor (',' valor)*;


id              : ID ('.'ID)* call_funcion;

call_funcion   : PIZQ (valor (',' valor)*)? PDER
                |
                ;

declaration         : primitive ID asignacion (',' ID asignacion)* SMCOLON
                    | ID asignacion_id SMCOLON;

asignacion          : '=' valor
                    | ;

asignacion_id       : ('.' ID)* '=' valor
                    | ID;


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

si              : 'si' PIZQ valor (RIP valor)* PDER 'entonces' comands si_no 'fin_si';

si_no            : 'si_no' comands
                |
                ;

func_id         : ID PIZQ par_fun PDER SMCOLON;
par_fun         : valor (',' valor)*
                |
                ;

mientras           : 'mientras' PIZQ valor PDER 'hacer' comands 'fin_mientras';

hacer_mientras        : 'hacer' comands 'mientras' PIZQ valor PDER SMCOLON;

para             : 'para' PIZQ declaration valor SMCOLON valor PDER 'hacer' comands 'fin_para';

seleccionar          : 'seleccionar' PIZQ id PDER 'entre' casos 'fin_seleccionar';

casos           : 'caso' valor ':' comands (romper)? casos
                | 'defecto' ':' comands (romper)?
                |
                ;

romper          : 'romper' SMCOLON;

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