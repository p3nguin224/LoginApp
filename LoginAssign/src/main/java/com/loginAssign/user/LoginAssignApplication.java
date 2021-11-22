package com.loginAssign.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loginAssign.user.domain.User;
import com.loginAssign.user.service.UserService;
import com.loginAssign.user.utility.SecurityUtility;

@SpringBootApplication
public class LoginAssignApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(LoginAssignApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setUsername("test@gmail.com");
		user1.setEmail("test@gmail.com");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("1234"));
		
		
		userService.createUser(user1);
		
	}
	
	

}
