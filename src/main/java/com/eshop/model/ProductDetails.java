package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class ProductDetails {

	
	
	@Id
    @Column(name = "PRODUCTID")
	private int productId;
	
	@Column(name = "PRODUCTNAME")
	private String productName;
	
	@Column(name = "PRODUCTDESCRIPTION")
	private String productDescription;
	
	@Column(name = "PRODUCTPRICE")
	private int productPrice;
	
	
	@Column(name = "CATEGORYID")
	private int catId;
	
	@Column(name = "SUPPLIERID")
	private String supId;
	
	@Column(name="STOCK")
	private int stock;
	
	

	@Transient
	private MultipartFile pImage;
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public MultipartFile getpImage() {
		return pImage;
	}

	public void setpImage(MultipartFile pImage) {
		this.pImage = pImage;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

    public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getSupId() {
		return supId;
	}

	public void setSupId(String supId) {
		this.supId = supId;
	}

	
	
	
	
	
	
}
