package com.niit.collabarationbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.ApplicationConfig;
import com.niit.dao.UsersDao;
import com.niit.model.Users;

public class App {

	public static void main(String[] args) {
		System.out.println("first");
		 AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		 UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("UsersDaoImpl");
		 System.out.println("starting");
	        Users user=new Users();
	        user.setUsername("test");
	        user.setPassword("text");
	        userDao.registerUser(user);
	        System.out.println("sai");
	}

}
