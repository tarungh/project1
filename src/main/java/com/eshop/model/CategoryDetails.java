package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table
@Component
public class CategoryDetails {
	@Id
	
	@Column(name = "CID")
	private int cId;
	
	@Column(name = "CNAME")
	private String cName;
	
	@Column(name = "CDIS")
	private String cDis;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcDis() {
		return cDis;
	}

	public void setcDis(String cDis) {
		this.cDis = cDis;
	}
	

	
}
