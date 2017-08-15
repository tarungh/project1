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

@Repository
public class LoginDao {
	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public UserCredentials getUser(String username) {
		//creating session object    
				Session session=sessionfactory.openSession();    
				    
				//creating transaction object    
				Transaction t=session.beginTransaction();    
		String hql = "from "+" UserCredentials "+" where username=" + "'"+username+"'";
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserCredentials> listUser = (List<UserCredentials>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		t.commit();//transaction is commited    
		session.close();  
		
		return null;
	}
}
