package com.db.hack.wise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.hack.wise.model.School;
import com.db.hack.wise.service.SchoolService;

/**
 * Created by Balamurugan on 6/4/2019.
 */

@RestController
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;

	@GetMapping("/school/{id}")
	public School getSchool(@PathVariable("id") int id) {
		return schoolService.get(id);
	}

	@GetMapping("/school/all")
	public List<School> getAllSchool() {
		return schoolService.getAll();
	}
	
	@PostMapping("/school")
	public School saveSchool(@RequestBody  School school) {
		return schoolService.save(school);
	}
	
	@DeleteMapping("/school/{id}")
	public void deleteSchool(@PathVariable("id") int id) {
		 schoolService.delete(id);
	}
	
	@PutMapping("/school/{id}")
	public School updateSchool(@PathVariable("id") int id,@RequestBody  School school) {
		 return schoolService.update(id,school);
	}

}
