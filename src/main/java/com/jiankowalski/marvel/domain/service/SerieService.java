package com.jiankowalski.marvel.domain.service;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Serie;

import org.springframework.stereotype.Service;

import com.jiankowalski.marvel.domain.model.Character;

@Service
public interface SerieService {
    List<Serie> findByCharacter(Character character);
}
