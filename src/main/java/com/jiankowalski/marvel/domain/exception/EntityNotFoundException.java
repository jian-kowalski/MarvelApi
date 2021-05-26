package com.jiankowalski.marvel.domain.exception;

public class EntityNotFoundException extends BusineException {

    private static final long serialVersionUID = 1L;

    protected EntityNotFoundException(String mensagem) {
        super(mensagem);
    }

}