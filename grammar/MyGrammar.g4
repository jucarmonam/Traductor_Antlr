grammar MyGrammar;

inicio      : (funcion | estructura)* main (funcion | estructura)*;

estructura     : 'estructura' ID (declaractionEstruct)+ 'fin_estructura';

declaractionEstruct : type ID (',' ID)* SMCOLON;

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

imprimir           : 'imprimir' PIZQ imprimir_  PDER SMCOLON;
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


valor           : PIZQ valor (operador_logico valor)* PDER
                | operador_neg valor
                | valor operador_binario valor
                | DOUBLE
                | INT
                | CARACTER
                | STRING
                | id
                | BOOLEANO
                ;

si              : 'si' PIZQ valor (operador_logico valor)* PDER 'entonces' comands si_no 'fin_si';

si_no            : 'si_no' comands
                |
                ;

func_id         : ID PIZQ par_fun PDER SMCOLON;
par_fun         : valor (',' valor)*
                |
                ;

mientras        : 'mientras' PIZQ valor (operador_logico valor)* PDER 'hacer' comands 'fin_mientras';

hacer_mientras  : 'hacer' comands 'mientras' PIZQ valor (operador_logico valor)* PDER SMCOLON;

para            : 'para' PIZQ declaration valor (operador_logico valor)* SMCOLON (INT|ID) PDER 'hacer' comands 'fin_para';

seleccionar     : 'seleccionar' PIZQ valor PDER 'entre' casos 'fin_seleccionar';

casos           : (casos_)+ defecto?
                | defecto;

casos_          : 'caso' valor ':' comands (romper)?;

defecto         : 'defecto' ':' comands (romper)?;

romper          : 'romper' SMCOLON;

type            : ID
                | primitive
                ;

operador_binario    : '+'
                    | '-'
                    | '*'
                    | '/'
                    | '%'
                    ;

operador_logico     : ROP
                    | RIP
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
INT     : [0-9]+;
DOUBLE	: [0-9]+( | [.][0-9]+);
STRING  : '"' .*? '"';
CARACTER  : '\''[a-zA-Z]'\'';
BOOLEANO : ('verdadero' | 'falso');
ID 		: [a-zA-Z][a-zA-Z0-9_]* ;