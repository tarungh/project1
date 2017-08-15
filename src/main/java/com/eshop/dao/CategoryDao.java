package com.eshop.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;
@Repository
public class CategoryDao {
	@Autowired
	SessionFactory sessionfactory;
	public void insertCategory(CategoryDetails cd)
	{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	s.saveOrUpdate(cd);
	t.commit();
	s.close();
	}
public List retCatDet()
{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();

	String h="from CategoryDetails";
	Query q=s.createQuery(h);
	List res=q.list();
	s.close();
	return res;
}
public void delCat(int cId)
{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	CategoryDetails c=(CategoryDetails)s.get(CategoryDetails.class, cId);
	s.delete(c);
	t.commit();
	s.close();
}
public CategoryDetails getCat(int cId)
{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	CategoryDetails c=(CategoryDetails)s.get(CategoryDetails.class, cId);
	s.close();
	return c;
	
}

}

