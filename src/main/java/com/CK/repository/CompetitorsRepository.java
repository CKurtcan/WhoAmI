package com.CK.repository;

import com.CK.entity.Competitors;

public class CompetitorsRepository extends RepositoryManager<Competitors,Long> {
    public CompetitorsRepository() {
        super(new Competitors());
    }
}
