package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.OrderDetails;



@Repository
public class OrderDao {
      
	@Autowired
	SessionFactory sessionfactory;
	public void insertOrder(OrderDetails od)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(od);
		t.commit();
		s.close();
	}
	
	public List retreiveOrder(String username)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		String h = "from "+" OrderDetails "+" where cartUser=" + "'"+username+"'";
		Query q=s.createQuery(h);
		List res=q.list();
		s.close();
		return res;
	}

}
