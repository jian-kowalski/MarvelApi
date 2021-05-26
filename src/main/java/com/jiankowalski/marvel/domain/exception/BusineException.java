package com.jiankowalski.marvel.domain.exception;

public class BusineException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusineException(String mensagem) {
        super(mensagem);
    }

    public BusineException(String mensagem, Throwable cause) {
        super(mensagem, cause);
    }

}