package com.jiankowalski.marvel.domain.service;

import java.util.List;

import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.model.Comic;

import org.springframework.stereotype.Service;

@Service
public interface ComicService {
    List<Comic> findByCharacter(Character character);
}
