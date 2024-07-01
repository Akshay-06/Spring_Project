package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.UserRepository;
import com.spring.model.User;

@RestController
public class UserResource {

	
	@Autowired
	UserRepository repo;
	
	@GetMapping("getUsers")
	public List<User> getAllUsers(){
		return (List<User>) repo.findAll();
	}
	
}
