package com.db.hack.wise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.db.hack.wise.model.Questions;
import com.db.hack.wise.model.StudentQuestions;
import com.db.hack.wise.service.StudentQuestionsService;

/**
 * Created by Balamurugan on 6/4/2019.
 */

@CrossOrigin
@RestController
public class StudentQuestionsController {
	
	@Autowired
	private StudentQuestionsService studentQuestionsService;

	@GetMapping("/studentQuestions/{id}")
	public StudentQuestions getStudentQuestions(@PathVariable("id") int id) {
		return studentQuestionsService.get(id);
	}

	@GetMapping("/studentQuestions/all")
	public List<StudentQuestions> getAllStudentQuestions() {
		return studentQuestionsService.getAll();
	}
	
	@PostMapping("/studentQuestions")
	public StudentQuestions saveStudentQuestions(@RequestBody  StudentQuestions studentQuestions) {
		return studentQuestionsService.save(studentQuestions);
	}
	
	@DeleteMapping("/studentQuestions/{id}")
	public void deleteStudentQuestions(@PathVariable("id") int id) {
		studentQuestionsService.delete(id);
	}
	
	@PutMapping("/studentQuestions/{id}")
	public StudentQuestions updateStudentQuestions(@PathVariable("id") int id, @RequestBody  StudentQuestions studentQuestions) {
		 return studentQuestionsService.update(studentQuestions);
	}
	
	@GetMapping("/studentQuestions/classname/{classname}")
	public List<StudentQuestions> getStudentQuestionsForCourse(@PathVariable("classname") String className) {
		return studentQuestionsService.getForCourseId(className);
	}
	
	@GetMapping("/studentQuestions/course/name")
	public List<String> getDistinctListOfCourse() {
		return studentQuestionsService.getDistinctListOfCourse();
	}
	
	@GetMapping("/studentQuestions/classname/questions/{classname}")
	public List<Questions> getQuestionsForCourse(@PathVariable("classname") String className) {
		return studentQuestionsService.getQuestionsForCourse(className);
	}


	@GetMapping("/studentQuestions/course/{courseName}/class")
	public List<String> getClassCourse(@PathVariable("courseName") String courseName) {
		return studentQuestionsService.getClassForCourse(courseName);
	}

}
