package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMobile {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("context is loding");
		
//		Airtel airtel = (Airtel)context.getBean("airtel");
//		airtel.calling();
//		airtel.data();
		
		Sim sim =(Sim)context.getBean("sim");
		sim.calling();
		sim.data();
		
	}
}
