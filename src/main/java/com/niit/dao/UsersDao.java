package com.niit.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.niit.model.Users;

@ComponentScan("com")
@Repository

public interface UsersDao {
	
	public void registerUser(Users user);
	
	
	

}