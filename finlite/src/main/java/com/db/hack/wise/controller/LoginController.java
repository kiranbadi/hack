package com.db.hack.wise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.hack.wise.service.LoginService;

/**
 * Created by Balamurugan on 6/4/2019.
 */

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public Boolean getEmployees(@RequestParam("id") int id, @RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		return loginService.getMemberDetails(id, userName, password);
	}

}
