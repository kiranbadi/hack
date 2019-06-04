package com.db.hack.wise.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.db.hack.wise.dao.StudentQuestionsRepository;
import com.db.hack.wise.model.StudentQuestions;
import com.db.hack.wise.service.StudentQuestionService;

/**
 * Created by Balamurugan on 6/4/2019.
 */
@Component
public class StudentQuestionsServiceImpl implements StudentQuestionService {
	@Autowired
	private StudentQuestionsRepository studentQuestionsRepository;

	@Override
	public StudentQuestions get(int id) {
		Optional<StudentQuestions> result = studentQuestionsRepository.findById((long) id);
		if (result.isPresent()) {
			return result.get();
		}

		return new StudentQuestions();
	}

	@Override
	public List<StudentQuestions> getAll() {
		List<StudentQuestions> schoolList = new ArrayList<StudentQuestions>();
		Iterable<StudentQuestions> result = studentQuestionsRepository.findAll();
		if (result != null) {
			result.forEach(studentQuestions -> schoolList.add(studentQuestions));
		}
		return Arrays.asList(new StudentQuestions());
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
}