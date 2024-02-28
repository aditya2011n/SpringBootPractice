package com.springBoot.jsp.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Product {

	@Id
	private String pid;
	private String productName;
	
	@ManyToMany(mappedBy = "proList")
	private List<Category> catList = new ArrayList<>();
	
	public List<Category> getCatList() {
		return catList;
	}
	public void setCatList(ArrayList<Category> catList) {
		this.catList = catList;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + "]";
	}
	
}
