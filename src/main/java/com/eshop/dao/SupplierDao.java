package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.eshop.model.SupplierDetails;
@Repository
public class SupplierDao {
	@Autowired
	SessionFactory sessionfactory;
	public void insertSupplier(SupplierDetails sd)
	{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	s.saveOrUpdate(sd);
	t.commit();
	s.close();
	
	}
	public List retSupDet()
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();

		String h="from SupplierDetails";
		Query q=s.createQuery(h);
		List res=q.list();
		s.close();
		return res;
	}
	public void delSup(int sId)
	{
		Session ses=sessionfactory.openSession();
		Transaction t=ses.beginTransaction();
		SupplierDetails s=(SupplierDetails)ses.get(SupplierDetails.class, sId);
		ses.delete(s);
		t.commit();
		ses.close();
	} 
	public SupplierDetails getSup(int sId)
	{
		Session ses=sessionfactory.openSession();
		Transaction t=ses.beginTransaction();
		SupplierDetails s=(SupplierDetails)ses.get(SupplierDetails.class, sId);
		ses.close();
		return s;
		
	}
	
	
	
	}
