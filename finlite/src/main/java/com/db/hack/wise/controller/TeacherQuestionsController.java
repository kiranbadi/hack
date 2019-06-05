package com.db.hack.wise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.db.hack.wise.model.TeacherQuestions;
import com.db.hack.wise.service.TeacherQuestionsService;;

/**
 * Created by Balamurugan on 6/5/2019.
 */

@CrossOrigin
@RestController
public class TeacherQuestionsController {
	
	@Autowired
	private TeacherQuestionsService teacherQuestionsService;

	@GetMapping("/teacherQuestions/{id}")
	public TeacherQuestions getTeacherQuestions(@PathVariable("id") int id) {
		return teacherQuestionsService.get(id);
	}

	@GetMapping("/teacherQuestions/all")
	public List<TeacherQuestions> getAllTeacherQuestions() {
		return teacherQuestionsService.getAll();
	}
	
	@PostMapping("/teacherQuestions")
	public TeacherQuestions saveTeacherQuestions(@RequestBody  TeacherQuestions teacherQuestions) {
		return teacherQuestionsService.save(teacherQuestions);
	}
	
	@DeleteMapping("/teacherQuestions/{id}")
	public void deleteTeacherQuestions(@PathVariable("id") int id) {
		teacherQuestionsService.delete(id);
	}
	
	@PutMapping("/teacherQuestions/{id}")
	public TeacherQuestions updateTeacherQuestions(@PathVariable("id") int id, @RequestBody  TeacherQuestions teacherQuestions) {
		 return teacherQuestionsService.update(teacherQuestions);
	}
	
	@GetMapping("/teacherQuestions/classname/{classname}")
	public List<TeacherQuestions> getTeacherQuestionsForCourse(@PathVariable("classname") String className) {
		return teacherQuestionsService.getForCourseId(className);
	}
	
	@GetMapping("/teacherQuestions/course/name")
	public List<String> getDistinctListOfCourse() {
		return teacherQuestionsService.getDistinctListOfCourse();
	}

	@GetMapping("/teacherQuestions/course/{courseName}/class")
	public List<String> getClassCourse(@PathVariable("courseName") String courseName) {
		return teacherQuestionsService.getClassForCourse(courseName);
	}

}
