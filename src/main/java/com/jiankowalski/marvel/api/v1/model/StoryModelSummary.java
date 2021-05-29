package com.jiankowalski.marvel.api.v1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoryModelSummary {
    private Long Id;
    private String title;
    private ThumbnailModel thumbnail;
}
