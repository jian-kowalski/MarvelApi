package com.jiankowalski.marvel.api.v1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SerieModelSummary {
    private Long Id;
    private String title;
    private ThumbnailModel thumbnail;
}
