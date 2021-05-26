package com.jiankowalski.marvel.domain.model;

public enum TypeUrl {

    UNDEFINED("undefined"), DETAIL("detail"), WIKI("wiki"), COMICLINK("comiclink");

    private String description;

    private TypeUrl(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
