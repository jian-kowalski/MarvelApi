package com.jiankowalski.marvel.api.model;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import lombok.Getter;
import lombok.Setter;
@Relation(collectionRelation = "characters")
@Setter
@Getter
public class CharacterModel extends RepresentationModel<CharacterModel> {

    private Long id;
    private String name;
    private String description;
    private OffsetDateTime modified;
    private ThumbnailModel thumbnail;
    private List<ComicModelSummary> comics;
    
}
