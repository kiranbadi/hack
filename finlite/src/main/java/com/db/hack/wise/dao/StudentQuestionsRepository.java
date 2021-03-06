package com.db.hack.wise.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.db.hack.wise.model.StudentQuestions;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public interface StudentQuestionsRepository extends CrudRepository<StudentQuestions,Long> {
	
	@Query("select studentQuestions from StudentQuestions studentQuestions where studentQuestions.className = :courseId")
	public List<StudentQuestions> getForCourseId(@Param("courseId")String courseId);
	
	@Query("select distinct studentQuestions.courseName from StudentQuestions studentQuestions")
	public List<String> getDistinctListOfCourse();

	@Query("select distinct studentQuestions.className from StudentQuestions studentQuestions where studentQuestions.courseName = :courseName")
	public List<String> getClassForCourse(@Param("courseName") String courseName);
	
}
