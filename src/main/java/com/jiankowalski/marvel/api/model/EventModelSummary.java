package com.jiankowalski.marvel.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventModelSummary  {
    private Long id;
    private String title;
    private ThumbnailModel thumbnail;
}
