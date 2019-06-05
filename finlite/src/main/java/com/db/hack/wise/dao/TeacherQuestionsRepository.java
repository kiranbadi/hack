package com.db.hack.wise.dao;

import com.db.hack.wise.model.TeacherQuestions;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public interface TeacherQuestionsRepository extends CrudRepository<TeacherQuestions,Long> {
	
	@Query("select teacherQuestions from TeacherQuestions teacherQuestions where teacherQuestions.className = :courseId")
	public List<TeacherQuestions> getForCourseId(@Param("courseId")String courseId);
	
	@Query("select distinct teacherQuestions.className from TeacherQuestions teacherQuestions")
	public List<String> getDistinctListOfCourse();
	
}
