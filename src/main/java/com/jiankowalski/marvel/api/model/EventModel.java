package com.jiankowalski.marvel.api.model;

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
