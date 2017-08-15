package com.eshop.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.controller.ProductController;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;
@Repository
public class ProductDao {
	@Autowired
	SessionFactory sessionfactory;
	public void insertProduct(ProductDetails pd)
	{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	s.saveOrUpdate(pd);
	t.commit();
	s.close();
	}
	public List retProDet()
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();

		String h="from ProductDetails";
		Query q=s.createQuery(h);
		List res=q.list();
		s.close();
		return res;
	}
	
	
	
	public void delProd(int productId)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		ProductDetails p=(ProductDetails)s.get(ProductDetails.class, productId);
		s.delete(p);
		t.commit();
		s.close();
	}
	
	public ProductDetails getPro(int productId)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		ProductDetails p=(ProductDetails)s.get(ProductDetails.class, productId);
		s.close();
		return p;
		
	}
	
}
