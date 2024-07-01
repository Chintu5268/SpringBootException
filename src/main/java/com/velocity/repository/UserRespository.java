package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.User;

public interface UserRespository extends CrudRepository<User, Serializable> {

	public User findById(Integer id);
}
