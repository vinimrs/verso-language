grammar Verso;

layout
    : page EOF
    ;

page
    : 'page' '{' content+ '}'
    ;

content
    : section
    | header
    | footer
    | paragraph
    | image
    | link
    ;

section
    : 'section' '{' content+ '}'
    ;

header
    : 'header' '{' text '}'
    ;

footer
    : 'footer' '{' text '}'
    ;

paragraph
    : 'paragraph' '{' text '}'
    ;

image
    : 'image' '(' STRING ')' attribute?
    ;

link
    : 'link' '(' STRING ')' '{' text '}'
    ;

attribute
    : 'alt' '=' STRING
    | 'href' '=' STRING
    ;

text
    : TEXT+
    ;

STRING
    : '"' (~["\r\n])* '"'
    ;

TEXT
    : ~[{}\r\n]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
