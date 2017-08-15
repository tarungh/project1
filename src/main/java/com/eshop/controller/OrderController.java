package com.eshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CartDao;
import com.eshop.dao.OrderDao;
import com.eshop.model.CartDetails;
import com.eshop.model.OrderDetails;

@Controller
public class OrderController {
	@Autowired
	CartDao cdao;
	@Autowired
	OrderDao od;
	
@RequestMapping("/orderdetails")
 public ModelAndView orderDet(@RequestParam("order")String cartUser)
 {
	OrderDetails odet= new OrderDetails();
cdao.retreiveCart("cartUser");
	odet.setCartUser(cartUser);
	System.out.println(odet.getCartUser());
	//odet.setOrderId(3);
	//od.insertOrder(odet);
	
	//List l=od.retreiveOrder((String)session.getAttribute("cartUser"));
	
	ModelAndView mv=new  ModelAndView("order","OrderDetails",odet);
	return mv;
 }

}