grammar Verso;

// Palavras-chave
PAGE: 'page';
SECTION: 'section';
HEADER: 'header';
FOOTER: 'footer';
PARAGRAPH: 'paragraph';
IMAGE: 'image';
LINK: 'link';
ALT: 'alt';
HREF: 'href';

// Regras de tokens
STRING : '"' ( ~["\r\n] | '""' )* '"';
TEXT: [a-zA-Z0-9]+ ( ' ' [a-zA-Z0-9]+ | '.')*;
WS 	:	( ' ' |'\t' | '\r' | '\n') -> skip
	;

// Simbolos não reconhecidos na linguagem
ERRO: '~' | '$' | '}' | '|' | '!' | '@' | '{' ;


// Regras de produção
layout: page EOF;

page: PAGE '{' content* '}';

content: section
       | header
       | footer
       | paragraph
       | image
       | link;

section: SECTION '{' content* '}';

header: HEADER '{' text '}';

footer: FOOTER '{' text '}';

paragraph: PARAGRAPH '{' text '}';

image: IMAGE '(' STRING ')' attribute?;

link: LINK '(' STRING ')' '{' text '}';

attribute: ALT '=' STRING
         | HREF '=' STRING;

text: TEXT+;
