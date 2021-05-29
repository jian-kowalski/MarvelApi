package com.jiankowalski.marvel.api.v1.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
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
    private List<ComicModelSummary> comics = new ArrayList<>();
    private List<EventModelSummary> events = new ArrayList<>();
    private List<StoryModelSummary> storys = new ArrayList<>();
    private List<SerieModelSummary> series = new ArrayList<>();
}
