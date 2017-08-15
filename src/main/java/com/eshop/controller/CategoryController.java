package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CategoryDao;
import com.eshop.model.CategoryDetails;


@Controller
public class CategoryController {
	@Autowired
	CategoryDao cd;
	@RequestMapping(value="/category",method=RequestMethod.GET)
	public ModelAndView cat()
	{
		CategoryDetails c=new CategoryDetails();
		List l=cd.retCatDet();
		ModelAndView mv= new ModelAndView("categories","CategoryDetails",c);
		mv.addObject("catData",l);
		mv.addObject("bname","AddCategory");
		return mv;  
	}
	@RequestMapping(value="/category",method=RequestMethod.POST)
	public ModelAndView cat1(@ModelAttribute("CategoryDetails") CategoryDetails c)
	{
        cd.insertCategory(c);
        CategoryDetails c1=new CategoryDetails();
        List l=cd.retCatDet();
		ModelAndView mv= new ModelAndView("categories","CategoryDetails",c1);
		mv.addObject("bname","AddCategory");
		mv.addObject("catData",l);
		return mv; 
	}
	
	@RequestMapping(value="/updatecat",method=RequestMethod.GET)
	public ModelAndView editCat(@RequestParam("ucat")int cId)
	{
		CategoryDetails c=cd.getCat(cId);
		List l=cd.retCatDet();
		ModelAndView mv= new ModelAndView("categories","CategoryDetails",c);
		mv.addObject("catData",l);
		mv.addObject("bname","UpdateCategory");
		return mv;  
	}
	
	
	@RequestMapping("/deletecat")
	public ModelAndView deleteCate(@RequestParam("dcid")int cId)
	{
		cd.delCat(cId);
		 CategoryDetails c1=new CategoryDetails();
	        List l=cd.retCatDet();
	        ModelAndView mv= new ModelAndView("categories","CategoryDetails",c1);
			mv.addObject("catData",l);
			mv.addObject("bname","AddCategory");
			return mv;
	}
	
	
}
