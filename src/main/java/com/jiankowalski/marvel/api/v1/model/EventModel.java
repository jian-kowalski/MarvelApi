package com.jiankowalski.marvel.api.v1.model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventModel extends EventModelSummary {
    private String description;
    private OffsetDateTime modified;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate; 
}
