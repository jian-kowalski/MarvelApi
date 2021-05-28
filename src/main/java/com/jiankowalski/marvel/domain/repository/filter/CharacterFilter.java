package com.jiankowalski.marvel.domain.repository.filter;

import java.time.OffsetDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CharacterFilter {
    private Long id;
    private String name;
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private OffsetDateTime modified;
    
}
