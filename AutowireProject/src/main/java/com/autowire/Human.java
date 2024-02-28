package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	Heart heart;

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}

	@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void showData() {
		System.out.println("Inside show data");
		
		if(heart==null) {
			System.out.println("you are dead");
		}
		else {
			heart.showHeart();
		}
	 	
	}

}
