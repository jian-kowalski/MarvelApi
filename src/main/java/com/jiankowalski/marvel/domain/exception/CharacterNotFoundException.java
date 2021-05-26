package com.jiankowalski.marvel.domain.exception;

public class CharacterNotFoundException extends EntityNotFoundException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public CharacterNotFoundException(Long cod) {
        super(String.format("Not found character for cód %d", cod));
    }
}
