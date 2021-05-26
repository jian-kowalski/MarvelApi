package com.jiankowalski.marvel.domain.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Thumbnail {

    private String path;

    private String extension;
    
}
