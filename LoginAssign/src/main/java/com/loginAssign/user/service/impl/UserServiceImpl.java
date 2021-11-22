package com.loginAssign.user.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginAssign.user.dao.UserDAO;
import com.loginAssign.user.domain.User;
import com.loginAssign.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userDAO.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userDAO.findByEmail(email);
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userDAO.save(user);
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		User tempUser = userDAO.findByEmail(user.getEmail());
		
		if (tempUser != null) {
			LOG.info("user {} already exists. Nothing will be done", user.getEmail());
		} else {
			tempUser = userDAO.save(user);
		}
		return tempUser;
	}

}
