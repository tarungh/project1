package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class OrderDetails {

    @Id
    
    @Column(name="OrderId")
    private int orderId; 
    
    @Column(name="CartUser")
    private String cartUser;
    
    @Column(name="TotalPrice")
    private int totalPrice;
    
    @Column(name="ShippingAddress")
    private String shippingAddress;
     
	

	public String getCartUser() {
		return cartUser;
	}

	public void setCartUser(String cartUser) {
		this.cartUser = cartUser;
	}

	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
    
    
    
}
