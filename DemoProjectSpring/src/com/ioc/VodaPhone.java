package com.ioc;

public class VodaPhone implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling from VodaPhone Network");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("data using from VodaPhone sim");
	}

}
