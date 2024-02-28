package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student student = new Student();
//		student.setMathCheat(new MathCheat());
//		student.showCheat();
		
//		AnotherStudent anotherStudent = (AnotherStudent)context.getBean("anotherStudent");
//		anotherStudent.showCheat();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student  =(Student) context.getBean("student");
		student.showCheat();
		

	}

}
