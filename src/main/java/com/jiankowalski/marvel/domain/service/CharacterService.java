package com.jiankowalski.marvel.domain.service;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Character;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public interface CharacterService {

    List<Character> findAll(Specification<Character> filter);

    Character findById( Long Id );
}
