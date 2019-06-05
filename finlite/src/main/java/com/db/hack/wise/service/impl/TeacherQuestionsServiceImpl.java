package com.db.hack.wise.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.db.hack.wise.dao.TeacherQuestionsRepository;
import com.db.hack.wise.model.TeacherQuestions;
import com.db.hack.wise.service.TeacherQuestionsService;

/**
 * Created by Balamurugan on 6/4/2019.
 */
@Component
public class TeacherQuestionsServiceImpl implements TeacherQuestionsService {
	@Autowired
	private TeacherQuestionsRepository teacherQuestionsRepository;

	@Override
	public TeacherQuestions get(int id) {
		Optional<TeacherQuestions> result = teacherQuestionsRepository.findById((long) id);
		if (result.isPresent()) {
			return result.get();
		}

		return new TeacherQuestions();
	}

	@Override
	public List<TeacherQuestions> getAll() {
		List<TeacherQuestions> teacherQuestionsList = new ArrayList<TeacherQuestions>();
		Iterable<TeacherQuestions> result = teacherQuestionsRepository.findAll();
		if (result != null) {
			result.forEach(teacherQuestions -> teacherQuestionsList.add(teacherQuestions));
			return teacherQuestionsList;
		}
		return Arrays.asList(new TeacherQuestions());
	}

	@Override
	public TeacherQuestions update(TeacherQuestions teacherQuestions) {
		TeacherQuestions response = teacherQuestionsRepository.save(teacherQuestions);
		return response;
	}

	@Override
	public void delete(int id) {
		teacherQuestionsRepository.deleteById((long) id);
	}

	@Override
	public TeacherQuestions save(TeacherQuestions teacherQuestions) {
		TeacherQuestions response = teacherQuestionsRepository.save(teacherQuestions);
		return response;
	}

	@Override
	public List<TeacherQuestions> getForCourseId(String courseId) {
		return teacherQuestionsRepository.getForCourseId(courseId);
	}
	
	@Override
	public List<String> getDistinctListOfCourse() {
		return teacherQuestionsRepository.getDistinctListOfCourse();
	}
}
