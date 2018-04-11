package com.company;

@interface InformacaoAula {

    String autor();
    int aulaNumero();
    String blog() default "http://google.com.br";
    String site() default "http://gitub.com";
}
