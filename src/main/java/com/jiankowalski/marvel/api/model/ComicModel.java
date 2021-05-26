package com.jiankowalski.marvel.api.model;

import java.time.OffsetDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComicModel {

    private Long id;
    private Integer digitalId = 0;
    private String title;
    private Integer issueNumber;
    private String variantDescription;
    private String description;
    private String resourceURI;
    private OffsetDateTime modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private String pageCount;
    // private List<TextObject> textObjects = new ArrayList<>();

    private List<UrlModel> urls;
    private List<CharacterModel> character;
    
}
