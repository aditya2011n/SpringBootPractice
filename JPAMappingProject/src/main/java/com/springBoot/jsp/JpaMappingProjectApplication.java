package com.springBoot.jsp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springBoot.jsp.StudentRepo.CategoryRepo;
import com.springBoot.jsp.StudentRepo.ProductRepo;
import com.springBoot.jsp.StudentRepo.StudentRepo;
import com.springBoot.jsp.entity.Address;
import com.springBoot.jsp.entity.Category;
import com.springBoot.jsp.entity.Laptop;
import com.springBoot.jsp.entity.Product;
import com.springBoot.jsp.entity.Student;

@SpringBootApplication
public class JpaMappingProjectApplication implements CommandLineRunner{
	
	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	CategoryRepo categoryRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaMappingProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Student  student = new Student();
//		student.setStudentName("Amartya Vish");
//		student.setAbout("Software engineer");
//		
//		//  we are setting here laptop data
//		Laptop laptop = new Laptop();
//		laptop.setBrand("Dell G3");
//		laptop.setModelNumber("84000");	
//		
//		// This one is imp
//		laptop.setStudent(student);
//		
//		// this also we need to save  
//		student.setLaptop(laptop);
//		
//		// saving the student data
//		studentRepo.save(student);
		
//		//  we are fetching the data 
//		Student student = studentRepo.findById(2).get();
//		System.out.println("Student Name ::"+ student.getStudentName());
//		
//		String modelNumber = student.getLaptop().getModelNumber();
//		System.out.println("Laptop Model Number ::"+ modelNumber);
		
//		// one to Many 
//		Student student = new Student();
//		student.setStudentName("Amartya Vish");
//		student.setAbout("Software engineer");
//		
//		Address address1 = new Address();
//		address1.setStreet("68 mahakaushal nagar");
//		address1.setCity("jabalpur");
//		address1.setCountry("India");
//		address1.setStudent(student);
//		
//		Address address2 = new Address();
//		address2.setStreet("naveen ki road");
//		address2.setCity("bhopal");
//		address2.setCountry("India");
//		address2.setStudent(student);
//		
//		List<Address> addList = new ArrayList<>();
//		addList.add(address1);
//		addList.add(address2);
//		
//		student.setAddressList(addList);
//		studentRepo.save(student);
		
		// Many to Many
		
		Product product1 = new Product();
		product1.setPid("pi1");
		product1.setProductName("i Phone");
		
		Product product2 = new Product();
		product2.setPid("pi2");
		product2.setProductName("washing machine");
		
		Product product3 = new Product();
		product3.setPid("pi3");
		product3.setProductName("Laptop");
		
		Category category1 = new Category();
		category1.setcID("cid1");
		category1.setTitle("Electronics");
		
		Category category2 = new Category();
		category2.setcID("cid2");
		category2.setTitle("china");
		
		List<Product> category1Products = category1.getProList();
		category1Products.add(product1);
		category1Products.add(product2);
		category1Products.add(product3);
		
		
		List<Product> category2Products = category2.getProList();
		category2Products.add(product1);
		category2Products.add(product2);
		
		
		categoryRepo.save(category1);
		categoryRepo.save(category2);
		
		
		
	}

}
