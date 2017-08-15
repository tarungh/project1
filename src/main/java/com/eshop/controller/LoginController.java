package com.eshop.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.LoginDao;
import com.eshop.dao.RegisterDao;
import com.eshop.model.UserCredentials;


@Controller
public class LoginController {

	@Autowired
	LoginDao ld;
	
	@RequestMapping("/login")
	public ModelAndView goLogin()
	{
		UserCredentials uc= new UserCredentials();
		ModelAndView mv=new ModelAndView("login","UserCredentials",uc);
		
		return mv;
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/login_session_attributes")
	public String login_session_attributes(HttpSession session,Model model) {
		String userid = SecurityContextHolder.getContext().getAuthentication().getName();
		UserCredentials  user =ld.getUser(userid);
		session.setAttribute("userId", user.getUsername());
		session.setAttribute("name", user.getPassword());
		session.setAttribute("LoggedIn", "true");
		
		 //session.setAttribute("crtcnt",count);
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		String page="";
		String role="ROLE_USER";
		for (GrantedAuthority authority : authorities) 
		{
		  
		     if (authority.getAuthority().equals(role)) 
		     {
		    	 session.setAttribute("UserLoggedIn", true);
		    	 session.setAttribute("UserName", user.getUsername());
			     page="/index1";
		    	 session.setAttribute("test",1);
		    	
		     }
		     else 
		     {
		    	 session.setAttribute("Administrator",true);
		    	 session.setAttribute("UserName", user.getUsername());
		    	 page="/administration";
			
		    }
		}
		return page;
	}

}
