package com.db.hack.wise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.hack.wise.service.LoginService;

/**
 * Created by Balamurugan on 6/4/2019.
 */

@CrossOrigin
@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public ResponseEntity<Boolean> getEmployees(@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		Boolean response = loginService.getMemberDetailsForUser(userName, password);
		if(response)
			return new ResponseEntity<Boolean>(response,HttpStatus.OK);
		else
			return new ResponseEntity<Boolean>(response,HttpStatus.UNAUTHORIZED);
		
	}

}
