package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eshop.model.UserCredentials;
import com.eshop.model.UserDetails;

@Repository
public class RegisterDao {
	@Autowired
	SessionFactory sessionfactory;
	public void insertDetails(UserDetails ud)
	{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	s.save(ud);
	t.commit();
	s.close();
	}
	
	public void insertUserCredentials(UserCredentials uc)
	{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	s.save(uc);
	t.commit();
	s.close();
	}
	
}
