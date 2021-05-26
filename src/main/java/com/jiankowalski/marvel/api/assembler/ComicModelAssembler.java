package com.jiankowalski.marvel.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import com.jiankowalski.marvel.api.model.ComicModel;
import com.jiankowalski.marvel.domain.model.Comic;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComicModelAssembler {

    public ComicModel toModel(Comic comic) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(comic, ComicModel.class);
    }

    public List<ComicModel> toCollectionModel(List<Comic> comics) {
        return comics.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
    
}
