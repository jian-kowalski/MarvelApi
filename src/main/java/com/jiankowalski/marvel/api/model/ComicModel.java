package com.jiankowalski.marvel.api.model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComicModel {

    private Long id;
    private Integer digitalId;
    private String title;
    private Integer issueNumber;
    private String variantDescription;
    private String description;
    private OffsetDateTime modified;
    private Integer number;
}
