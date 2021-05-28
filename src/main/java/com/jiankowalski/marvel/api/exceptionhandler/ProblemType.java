package com.jiankowalski.marvel.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

    
    PARAMETRO_INVALIDO( "Parâmeter invalid"),
    ERRO_INTERNAL( "Error interno"),
    RESOURCE_NOT_FOUND( "Resource not found");

    private String title;
    private String uri;

    ProblemType(String title) {
        this.title = title;
    }

}
