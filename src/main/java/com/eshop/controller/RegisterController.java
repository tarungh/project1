package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegisterDao;
import com.eshop.model.UserCredentials;
import com.eshop.model.UserDetails;

@Controller
public class RegisterController {
	@Autowired
	RegisterDao rd;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView reg1()
	{
		UserDetails u=new UserDetails();
		return new ModelAndView("register","UserDetails",u);
	}
	@RequestMapping(value="home",method=RequestMethod.GET)
	public String  ind()
	{
		
		return "index1";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView reg2(@ModelAttribute("UserDetails")UserDetails u)
	{
	
		UserCredentials uc=new UserCredentials();
		uc.setUsername(u.getUsername());
		uc.setPassword(u.getPassword());
		uc.setRole("ROLE_USER");
		uc.setEnabled(true);
		rd.insertUserCredentials(uc);
		rd.insertDetails(u);
		
		
		 ModelAndView mv = new ModelAndView("register","UserDetails",u);
		 return mv;
	}

}
