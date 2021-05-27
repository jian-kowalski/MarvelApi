package com.jiankowalski.marvel.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Comic {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "digital_id")
    private Integer digitalId = 0;
    private String title;
    private Integer issueNumber;
    private String variantDescription;

    @Column(length = 1000)
    private String description;

    @UpdateTimestamp
    private OffsetDateTime modified;

    @Column(length = 3)
    private Integer number;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Character character;
}
