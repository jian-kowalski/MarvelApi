package com.jiankowalski.marvel.domain.service;
import java.util.List;

import com.jiankowalski.marvel.domain.exception.CharacterNotFoundException;
import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.repository.CharacterRepository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public List<Character> findAll(Specification<Character> filter) {
        return characterRepository.findAll(filter);
    }

    @Override
    public Character findById( Long Id ) {
        return characterRepository.findById(Id)
            .orElseThrow(()-> new CharacterNotFoundException(Id));
    }
        
    
}
