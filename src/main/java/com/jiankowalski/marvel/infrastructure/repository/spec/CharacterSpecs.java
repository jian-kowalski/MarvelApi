
package com.jiankowalski.marvel.infrastructure.repository.spec;

import java.util.ArrayList;

import javax.persistence.criteria.Predicate;

import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.repository.filter.CharacterFilter;

import org.springframework.data.jpa.domain.Specification;

public class CharacterSpecs {

    public static Specification<Character> filter(CharacterFilter characterFilter) {
        return (root, query, builder) -> {

            var predicates = new ArrayList<Predicate>();

            if (characterFilter.getId() != null) {
                predicates.add(builder.equal(root.get("id"), characterFilter.getId()));
            }

            if (characterFilter.getName() != null) {
                predicates.add(builder.like(root.get("name"), "%" + characterFilter.getName() + "%"));
            }

            if (characterFilter.getModified() != null) {
                predicates.add(builder.greaterThanOrEqualTo(root.get("modified"), characterFilter.getModified()));
            }

            return builder.and(predicates.toArray(new Predicate[0]));
        };
    }

}
