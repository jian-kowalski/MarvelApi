package com.jiankowalski.marvel.domain.service;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Comic;
import com.jiankowalski.marvel.domain.model.Character;

import org.springframework.stereotype.Service;

@Service
public interface CharacterService {

    List<Character> findAll();

    Character findById( Long Id );

    List<Comic> findComicsById( Long Id );

}
