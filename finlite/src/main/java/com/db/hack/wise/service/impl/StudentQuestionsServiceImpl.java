package com.db.hack.wise.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.db.hack.wise.dao.StudentQuestionsRepository;
import com.db.hack.wise.model.Questions;
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


	@Override
	public List<String> getClassForCourse(String courseName){
		return studentQuestionsRepository.getClassForCourse(courseName);
	}



	
	@Override
	public List<Questions> getQuestionsForCourse(String courseName) {
		List<Questions> questionList = new ArrayList<Questions>();
		
		 List<StudentQuestions> datas = getForCourseId(courseName);
		 datas.forEach(data -> {
			 String[] questionAndoption = data.getItem().split("\r");
			 String question = questionAndoption[0];
			 List<String> options =  new ArrayList<String>();
			 options.add(questionAndoption[1]);
			 options.add(questionAndoption[2]);
			 options.add(questionAndoption[3]);
			 options.add(questionAndoption[4]);
			 String rationable = questionAndoption[5];
			 Questions quesiton = new Questions(data,question,options,rationable); 
			 questionList.add(quesiton);
			 });
		//return studentQuestionsRepository.getQuestionsForCourse(courseName);
		 return questionList;
	}

}
