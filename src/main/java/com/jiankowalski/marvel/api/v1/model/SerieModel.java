package com.jiankowalski.marvel.api.v1.model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SerieModel extends SerieModelSummary {
    private String description;
    private Integer startYear;
    private Integer endYear;
    private String rating;
    private OffsetDateTime modified;
}
