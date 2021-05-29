package com.jiankowalski.marvel.api.v1.model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComicModel extends ComicModelSummary {
    private Integer digitalId;
    private Integer issueNumber;
    private String variantDescription;
    private String description;
    private OffsetDateTime modified;
    private Integer number;
}
