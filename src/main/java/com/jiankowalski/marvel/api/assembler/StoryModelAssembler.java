package com.jiankowalski.marvel.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import com.jiankowalski.marvel.api.model.StoryModel;
import com.jiankowalski.marvel.domain.model.Story;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StoryModelAssembler {

    public StoryModel toModel(Story story) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(story, StoryModel.class);
    }

    public List<StoryModel> toCollectionModel(List<Story> storys) {
        return storys.stream().map(this::toModel).collect(Collectors.toList());
    }

}
