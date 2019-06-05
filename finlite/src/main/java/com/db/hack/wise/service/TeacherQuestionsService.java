package com.db.hack.wise.service;

import java.util.List;

import com.db.hack.wise.model.TeacherQuestions;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public interface TeacherQuestionsService {
	public TeacherQuestions get(int id);
	public List<TeacherQuestions> getAll();
	public TeacherQuestions update(TeacherQuestions teacherQuestion);
	public void delete(int id);
	public TeacherQuestions save(TeacherQuestions teacherQuestion);
	public List<TeacherQuestions> getForCourseId(String courseId);
	List<String> getDistinctListOfCourse();
	List<String> getClassForCourse(String courseName);
}
