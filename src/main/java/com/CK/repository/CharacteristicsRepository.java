package com.CK.repository;

import com.CK.entity.Characteristics;

public class CharacteristicsRepository extends RepositoryManager<Characteristics, Long> {

    public CharacteristicsRepository() {
        super(new Characteristics());
    }
}
