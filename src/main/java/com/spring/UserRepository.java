package com.spring;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.User;

public interface UserRepository  extends CrudRepository<User, Integer>{

}
