package com.loginAssign.user.service;


import com.loginAssign.user.domain.User;


public interface UserService {
	
	User findByUsername (String username);
	
	User findByEmail(String email);
	
	User save(User user);
	
	User createUser(User user);
}
