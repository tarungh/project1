package com.eshop.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.eshop.dao.SupplierDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;


@Controller
public class SupplierController {
	@Autowired
	SupplierDao sd;
	
	@RequestMapping(value="/supplier",method=RequestMethod.GET)
	public ModelAndView sup()
	{
		
		SupplierDetails s=new SupplierDetails();
		List li=sd.retSupDet();
		ModelAndView mv=new ModelAndView("suppliers","SupplierDetails",s);
		mv.addObject("supData",li);
		mv.addObject("bname","AddSupplier");
		return mv; 
	}
	@RequestMapping(value="/supplier",method=RequestMethod.POST)
	public ModelAndView sup1(@ModelAttribute("SupplierDetails")SupplierDetails s)
	{
		sd.insertSupplier(s);
		SupplierDetails s1=new SupplierDetails();
		List li=sd.retSupDet();
		ModelAndView mv=new ModelAndView("suppliers","SupplierDetails",s1);
		mv.addObject("supData",li);
		mv.addObject("bname","AddSupplier");
		return mv; 
	}
	
	@RequestMapping(value="/updatesup",method=RequestMethod.GET)
	public ModelAndView editSup(@RequestParam("usup")int sId)
	{
		SupplierDetails s=sd.getSup(sId);
		List li=sd.retSupDet();
		ModelAndView mv= new ModelAndView("suppliers","SupplierDetails",s);
		mv.addObject("supData",li);
		mv.addObject("bname","UpdateSupplier");
		return mv;  
	}
	
	
	@RequestMapping("/deletesup")
	public ModelAndView deleteCate(@RequestParam("dsid")int sId)
	{
		sd.delSup(sId);
		SupplierDetails s1=new SupplierDetails();
	        List li=sd.retSupDet();
	        ModelAndView mv= new ModelAndView("suppliers","SupplierDetails",s1);
			mv.addObject("supData",li);
			mv.addObject("bname","AddSupplier");
			return mv;
	}

}
