package com.jiankowalski.marvel.api.v1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoryModel extends StoryModelSummary{
    private String description;
    private String type;
}
