package com.jiankowalski.marvel.api.model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterModel {

    private Long id;
    private String name;
    private String description;
    private OffsetDateTime modified;
    private String resourceURI;
    private String path;
    private String extension;

 
    // private List<Comic> comics;


    // private Set<Story> stories;


    // private Set<Event> events;

    // private Set<Serie> series;

    // private Set<Url> urls;
    
}
