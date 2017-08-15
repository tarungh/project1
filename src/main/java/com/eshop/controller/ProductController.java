package com.eshop.controller;
import java.io.BufferedOutputStream;
import java.io.File;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CategoryDao;
import com.eshop.dao.ProductDao;
import com.eshop.dao.SupplierDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;
@Controller
public class ProductController {
	@Autowired
	CategoryDao cd;
	@Autowired
    SupplierDao sd;
	@Autowired
	ProductDao pd;
@RequestMapping(value="/product",method=RequestMethod.GET)
public ModelAndView proDet()
{
	ProductDetails p=new ProductDetails();
	List l=cd.retCatDet();
	/*Iterator itr=l.iterator();
	while(itr.hasNext())
	{
	Object o=itr.next();
	CategoryDetails cad=(CategoryDetails)o;
	System.out.println(cad.getcDis());
	}*/
	List li=sd.retSupDet();
	/*Iterator itr1=li.iterator();
	while(itr1.hasNext())
	{
	Object o=itr1.next();
	SupplierDetails sud=(SupplierDetails)o;
	System.out.println(sud.getsDis());
	}*/
    List lis=pd.retProDet();
	ModelAndView mv=new ModelAndView("product","ProductDetails",p);
	mv.addObject("catData",l);
	mv.addObject("supData",li);
	mv.addObject("proData",lis);
	mv.addObject("bname","AddProduct");
	return mv;
}
@RequestMapping(value="/product",method=RequestMethod.POST)
public ModelAndView getProDet(@ModelAttribute("ProductDetails") ProductDetails p)
{
	    
		
		pd.insertProduct(p);
		ProductDetails p1=new ProductDetails();
		List l=cd.retCatDet();
		List li=sd.retSupDet();
		List lis=pd.retProDet();
		ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
	    mv.addObject("catData",l);
	    mv.addObject("supData",li);
		mv.addObject("proData",lis);
		mv.addObject("bname","AddProduct");
		String path="E:\\project\\ekart\\src\\main\\webapp\\resources\\images\\";
		path=path+String.valueOf(p.getProductId())+".jpg";
		MultipartFile m=p.getpImage();
		File f=new File(path);
		try {
			FileOutputStream fos=new FileOutputStream(f);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			byte[] bt=m.getBytes();
			bos.write(bt);
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;

}
@RequestMapping(value="/updatepro",method=RequestMethod.GET)
public ModelAndView editCat(@RequestParam("upro")int productId)
{
	ProductDetails p=pd.getPro(productId);
	List l=cd.retCatDet();
	List li=sd.retSupDet();
	List lis=pd.retProDet();
	ModelAndView mv= new ModelAndView("product","ProductDetails",p);
	mv.addObject("catData",l);
    mv.addObject("supData",li);
	mv.addObject("proData",lis);
	mv.addObject("bname","UpdateProduct");
	return mv;  
}
@RequestMapping("/deleteprod")
public ModelAndView deleteCate(@RequestParam("dpid")int productId)
{
	pd.delProd(productId);
	ProductDetails p1=new ProductDetails();
	List l=cd.retCatDet();
	List li=sd.retSupDet();
        List lis=pd.retProDet();
        ModelAndView mv= new ModelAndView("product","ProductDetails",p1);
        mv.addObject("catData",l);
        
        mv.addObject("supData",li);
		mv.addObject("proData",lis);
		mv.addObject("bname","AddProduct");
		return mv;
}
@RequestMapping(value="/userpro",method=RequestMethod.GET)
public ModelAndView userPro()
{
	ProductDetails p=new ProductDetails();
	 List lis=pd.retProDet();
	 ModelAndView mv= new ModelAndView("userProduct","ProductDetails",p);
	 mv.addObject("proData",lis);
	return mv;
}
@RequestMapping(value="/singlepid",method=RequestMethod.GET)
public ModelAndView getsinglePro(@RequestParam("spid") int productId)
{
	ProductDetails p=pd.getPro(productId);
	List l=new ArrayList();
	l.add(p);
	ModelAndView mv= new ModelAndView("single","proData",l);
	return mv;  
}
}
