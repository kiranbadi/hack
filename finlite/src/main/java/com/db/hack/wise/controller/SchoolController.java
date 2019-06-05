package com.db.hack.wise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("/get")
	public School get(@RequestParam("id") int id) {
		return schoolService.get(id);
	}

}
