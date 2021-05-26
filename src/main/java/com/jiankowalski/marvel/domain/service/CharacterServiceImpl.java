package com.jiankowalski.marvel.domain.service;
import com.jiankowalski.marvel.domain.model.Comic;
import com.jiankowalski.marvel.domain.model.Character;

import java.util.List;

import com.jiankowalski.marvel.domain.exception.CharacterNotFoundException;
import com.jiankowalski.marvel.domain.repository.CharacterRepository;

import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> findAll() {
        return characterRepository.findAll();
    }

    public Character findById( Long Id ) {
        return characterRepository.findById(Id)
            .orElseThrow(()-> new CharacterNotFoundException(Id));
    }

    public List<Comic> findComicsById(Long Id) {
        return findById(Id).getComics();
    }

    
    
}
