package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Event {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String resourceURI;

    @UpdateTimestamp
    private OffsetDateTime modified;
    
    @Column(name="start_date")
    private OffsetDateTime startDate;

    @Column(name="end_date")
    private OffsetDateTime endDate;

    @Embedded
    private Thumbnail thumbnail;

    @ManyToOne
	private Character character;
}