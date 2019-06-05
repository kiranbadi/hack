package com.db.hack.wise.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.db.hack.wise.dao.StudentQuestionsRepository;
import com.db.hack.wise.model.StudentQuestions;
import com.db.hack.wise.service.StudentQuestionsService;

/**
 * Created by Balamurugan on 6/4/2019.
 */
@Component
public class StudentQuestionsServiceImpl implements StudentQuestionsService {
	@Autowired
	private StudentQuestionsRepository studentQuestionsRepository;

	@Override
	public StudentQuestions get(int id) {
		Optional<StudentQuestions> result = studentQuestionsRepository.findById((long) id);
		if (result.isPresent()) {
			return result.get();
		}

		return null;
	}

	@Override
	public List<StudentQuestions> getAll() {
		List<StudentQuestions> studentQuestionsList = new ArrayList<StudentQuestions>();
		Iterable<StudentQuestions> result = studentQuestionsRepository.findAll();
		if (result != null) {
			result.forEach(studentQuestions -> studentQuestionsList.add(studentQuestions));
			return studentQuestionsList;
		}
		return Arrays.asList();
	}

	@Override
	public StudentQuestions update(StudentQuestions studentQuestions) {
		StudentQuestions response = studentQuestionsRepository.save(studentQuestions);
		return response;
	}

	@Override
	public void delete(int id) {
		studentQuestionsRepository.deleteById((long) id);
	}

	@Override
	public StudentQuestions save(StudentQuestions studentQuestions) {
		StudentQuestions response = studentQuestionsRepository.save(studentQuestions);
		return response;
	}

	@Override
	public List<StudentQuestions> getForCourseId(String courseId) {
		return studentQuestionsRepository.getForCourseId(courseId);
	}
	
	@Override
	public List<String> getDistinctListOfCourse() {
		return studentQuestionsRepository.getDistinctListOfCourse();
	}
}
