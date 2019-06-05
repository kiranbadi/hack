package com.db.hack.wise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.hack.wise.model.School;
import com.db.hack.wise.model.StudentQuestions;
import com.db.hack.wise.service.SchoolService;
import com.db.hack.wise.service.StudentQuestionsService;

/**
 * Created by Balamurugan on 6/4/2019.
 */

@RestController
public class StudentQuestionsController {
	
	@Autowired
	private StudentQuestionsService studentQuestionsService;

	@RequestMapping("/studentQuestions/{id}")
	public StudentQuestions getSchool(@PathVariable("id") int id) {
		return studentQuestionsService.get(id);
	}

	@RequestMapping("/studentQuestions/all")
	public List<StudentQuestions> getAllSchool(@PathVariable("id") int id) {
		return studentQuestionsService.getAll();
	}
	
	@PostMapping("/studentQuestions")
	public List<StudentQuestions> saveSchool(@RequestBody  School school) {
		return studentQuestionsService.getAll();
	}
	
	@DeleteMapping("/studentQuestions/{id}")
	public void deleteSchool(@PathVariable("id") int id) {
		studentQuestionsService.delete(id);
	}
	
	@PutMapping("/studentQuestions/{id}")
	public StudentQuestions updateSchool(@PathVariable("id") int id,@RequestBody  StudentQuestions studentQuestions) {
		 return studentQuestionsService.update(studentQuestions);
	}

}
