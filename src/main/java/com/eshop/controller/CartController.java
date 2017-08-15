package com.eshop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CartDao;
import com.eshop.dao.CategoryDao;
import com.eshop.dao.ProductDao;
import com.eshop.dao.SupplierDao;
import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;

@Controller
public class CartController {
	@Autowired 
	CartDao cdao;
	@Autowired
	ProductDao pd;
	
	
	@RequestMapping(value="/addtocart",method=RequestMethod.POST)
	public ModelAndView addToCart(@RequestParam("cpid")String productId,@RequestParam("quantity") int qty,HttpSession session)
	{
		int x=Integer.parseInt(productId);
		ProductDetails p=pd.getPro(x);
		CartDetails c=new CartDetails();
		
		c.setCartUser((String)session.getAttribute("userId"));
	    c.setProId(p.getProductId());
		c.setProName(p.getProductName());
		c.setProPrice(p.getProductPrice());
		c.setTotalPrice(c.getTotalPrice()*1);
		cdao.insertCart(c);
	
		List l=cdao.retreiveCart((String)session.getAttribute("userId"));
		
	        ModelAndView mv= new ModelAndView("cart","cartData",l);
	       
			return mv;
	}
	
	

	
	
	
}
