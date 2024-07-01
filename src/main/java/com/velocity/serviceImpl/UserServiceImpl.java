package com.velocity.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.exception.UserNotFoundException;
import com.velocity.model.User;
import com.velocity.repository.UserRespository;
import com.velocity.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRespository userRespository;

	@Override
	public User getUser(Integer id) {
		User user1 = userRespository.findById(id);
		if (user1 == null) {
			throw new UserNotFoundException("User ID is not present into database");
		}
		return user1;
	}

}
