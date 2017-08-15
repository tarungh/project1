package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class SupplierDetails {
@Id

	@Column(name = "SID")
	private int sId;
@Column(name = "SNAME")
private String sName;

@Column(name = "SDIS")
private String sDis;
	
	public int getsId() {
	return sId;
}

public void setsId(int sId) {
	this.sId = sId;
}

public String getsName() {
	return sName;
}

public void setsName(String sName) {
	this.sName = sName;
}

public String getsDis() {
	return sDis;
}

public void setsDis(String sDis) {
	this.sDis = sDis;
}

	
}
