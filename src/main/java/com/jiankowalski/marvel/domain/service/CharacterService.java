package com.jiankowalski.marvel.domain.service;

import com.jiankowalski.marvel.domain.model.Character;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public interface CharacterService {

    Page<Character> findAll(Specification<Character> spec, Pageable pageable);

    Character findById( Long Id );
}
