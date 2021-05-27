package com.jiankowalski.marvel.api.model;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import lombok.Getter;
import lombok.Setter;

@Relation("comics")
@Getter
@Setter
public class ComicModelSummary extends RepresentationModel<ComicModelSummary> {

    private Long id;
    private String title;

    
}
