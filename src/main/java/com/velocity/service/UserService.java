package com.velocity.service;

import com.velocity.model.User;

public interface UserService {

	// design the restful web service fetch data from database on basis od id
	
	public User getUser(Integer id);
}
