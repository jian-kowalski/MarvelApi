package com.jiankowalski.marvel.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoryModel extends StoryModelSummary{
    private String description;
    private String type;
}
