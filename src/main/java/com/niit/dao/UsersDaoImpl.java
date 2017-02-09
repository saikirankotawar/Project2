package com.niit.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Users;
@Repository("userDaoImpl")
@Transactional
public class UsersDaoImpl implements UsersDao{
@Autowired

private SessionFactory sessionfactory;
public void registerUser(Users user)
{
	Session session=sessionfactory.getCurrentSession();
	session.save(user);
	System.out.println("user saved");
	System.out.println("sai");
}
}
