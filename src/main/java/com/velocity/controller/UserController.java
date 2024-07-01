package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.User;
import com.velocity.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable ("id") Integer id) {
		User user2=userService.getUser(id);
		return user2;
		
	}
}
