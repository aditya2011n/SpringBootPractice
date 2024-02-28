package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student student = new Student();
//		student.setStudentName("aditya narayan");
//		student.displayStudent();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Student Ashish =(Student)context.getBean("Ashish");
//		Ashish.displayStudent();
		
//		Student student = new Student("laxmi", 1);
//		student.displayStudent();
		
		Student laxmi = (Student) context.getBean("laxmi");
		laxmi.displayStudent();
		
		Student adiStudent = (Student)context.getBean("aditya");
		adiStudent.displayStudent();
	}

}
