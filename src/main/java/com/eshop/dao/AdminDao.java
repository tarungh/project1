package com.eshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.AdminDetails;


@Repository
public class AdminDao {
	@Autowired
	SessionFactory sessionfactory;
	public void details(AdminDetails ad)
	{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	s.save(ad);
	t.commit();
	s.close();
	
	}
}
