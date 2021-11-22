package com.loginAssign.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.loginAssign.user.domain.User;

public interface UserDAO extends CrudRepository<User, Integer>{
	User findByUsername(String username);
	
	User findByEmail(String email);
}
