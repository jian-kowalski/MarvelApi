package com.jiankowalski.marvel.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SerieModelSummary {
    private Long Id;
    private String title;
    private ThumbnailModel thumbnail;
}