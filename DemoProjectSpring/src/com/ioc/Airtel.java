package com.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Airtel Network");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("data using from Airtel sim");
	}

}
