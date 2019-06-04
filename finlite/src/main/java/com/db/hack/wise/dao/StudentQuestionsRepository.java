package com.db.hack.wise.dao;

import org.springframework.data.repository.CrudRepository;

import com.db.hack.wise.model.StudentQuestions;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public interface StudentQuestionsRepository extends CrudRepository<StudentQuestions,Long> {
	
}
