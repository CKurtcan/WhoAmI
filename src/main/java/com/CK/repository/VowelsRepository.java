package com.CK.repository;

import com.CK.entity.Vowels;

public class VowelsRepository extends RepositoryManager<Vowels,Long> {
    public VowelsRepository() {
        super(new Vowels());
    }
}
