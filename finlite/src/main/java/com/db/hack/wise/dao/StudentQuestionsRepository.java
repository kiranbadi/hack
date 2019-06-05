package com.db.hack.wise.dao;

import com.db.hack.wise.model.StudentQuestions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public interface StudentQuestionsRepository extends CrudRepository<StudentQuestions,Long> {

    @Query("SELECT sd.className from StudentQuestions sd")
    List<String> getAllCourses();
	
}
