package com.jiankowalski.marvel.domain.service;

import com.jiankowalski.marvel.domain.exception.CharacterNotFoundException;
import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.repository.CharacterRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public Character findById(Long Id) {
        return characterRepository.findById(Id)
            .orElseThrow(() -> new CharacterNotFoundException(Id));
    }

    @Override
    public Page<Character> findAll(Specification<Character> spec, Pageable pageable) {
        return characterRepository.findAll(spec, pageable);
    }

}
