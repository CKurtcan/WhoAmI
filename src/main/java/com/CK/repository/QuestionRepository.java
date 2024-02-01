package com.CK.repository;

import com.CK.entity.Questions;

public class QuestionRepository extends RepositoryManager<Questions,Long> {

    public QuestionRepository() {
        super(new Questions());
    }
}
