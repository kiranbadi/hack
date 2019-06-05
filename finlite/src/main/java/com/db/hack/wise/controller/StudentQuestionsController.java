package com.db.hack.wise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.hack.wise.model.StudentQuestions;
import com.db.hack.wise.service.StudentQuestionsService;

/**
 * Created by Balamurugan on 6/4/2019.
 */

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
	
	@GetMapping("/studentQuestions/classname/name")
	public List<String> getStudentQuestionsForCourse() {
		return studentQuestionsService.getDistinctListOfCourse();
	}

}
