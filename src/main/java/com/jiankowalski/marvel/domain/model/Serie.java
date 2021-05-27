package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Serie{
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    private String description;

    private Integer startYear;
    private Integer endYear;
    private String rating;

    @UpdateTimestamp
    private OffsetDateTime modified;

    @Embedded
    private Thumbnail thumbnail;

    @ManyToOne
    private Character character; 
}