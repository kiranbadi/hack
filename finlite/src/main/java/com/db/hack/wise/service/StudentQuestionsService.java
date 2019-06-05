package com.db.hack.wise.service;

import java.util.List;

import com.db.hack.wise.model.Questions;
import com.db.hack.wise.model.StudentQuestions;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public interface StudentQuestionsService {
	public StudentQuestions get(int id);
	public List<StudentQuestions> getAll();
	public StudentQuestions update(StudentQuestions studentQuestion);
	public void delete(int id);
	public StudentQuestions save(StudentQuestions studentQuestion);
	public List<StudentQuestions> getForCourseId(String courseId);
	List<String> getDistinctListOfCourse();

	List<String> getClassForCourse(String courseName);


	List<Questions> getQuestionsForCourse(String courseName);
}
