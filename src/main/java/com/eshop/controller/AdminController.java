package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.AdminDao;
import com.eshop.model.AdminDetails;

@Controller
public class AdminController {
	@Autowired
	AdminDao ad;
	
@RequestMapping(value="/admin",method=RequestMethod.GET)
public ModelAndView adm()
{
	AdminDetails a=new AdminDetails();
	return new ModelAndView("administration","AdminDetails",a);
}
@RequestMapping(value="/admin",method=RequestMethod.POST)
public ModelAndView adm1(@ModelAttribute("AdminDetails")AdminDetails a)
{
    ad.details(a);
	return new ModelAndView("administration","AdminDetails",a);
}
@RequestMapping(value="/contact",method=RequestMethod.GET)
public ModelAndView contactUs()
{
	
	return new ModelAndView("contactUs");
}


@RequestMapping(value="/abt",method=RequestMethod.GET)
public ModelAndView about()
{
	
	return new ModelAndView("about");
}
}
