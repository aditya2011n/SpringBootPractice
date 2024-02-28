package com.springBoot.jsp.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Category {

	@Id
	private String cID;
	private String title;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product> proList = new ArrayList<>();

	public List<Product> getProList() {
		return proList;
	}
	
	public void setProList(ArrayList<Product> proList) {
		this.proList = proList;
	}
	public String getcID() {
		return cID;
	}
	public void setcID(String cID) {
		this.cID = cID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Category [cID=" + cID + ", title=" + title + "]";
	}
	
}
