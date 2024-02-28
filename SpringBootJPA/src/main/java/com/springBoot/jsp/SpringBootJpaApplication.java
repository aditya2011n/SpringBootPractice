package com.springBoot.jsp;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.springBoot.jsp.entity.Student;
import com.springBoot.jsp.repo.StudentRepo;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
		
		Student student1 = new Student();
		student1.setName("Naveen");
		student1.setAddress("kahi nahi");
		
//		Student student2 = new Student();
//		student2.setName("laxmi");
//		student2.setAddress("sab jagah");
//		
//		Student student3 = new Student();
//		student3.setName("Abhishek");
//		student3.setAddress("kachara ghar");
		
//		Student save = studentRepo.save(student1);
// 		System.out.println("data is save::"+save);
		
	//	List<Student> saveAll = studentRepo.saveAll(List.of(student1,student2,student3));
	//	System.out.println("Printing this saveAll data");
	//	saveAll.forEach(Student -> System.out.println(Student));
		
		// finds by id
//		Optional<Student> findById = Optional.of(studentRepo.findById(8).get());
//		System.out.println("Id is ::"+ findById);
		
		// delete by ID
//		int id = 8;
//		String name = "Naveen";
//		
//		System.out.println("Printing all the data");
//		List<Student> allData = studentRepo.findAll();
//		for (Student student : allData) {
//			if(student.getName().equals(name)) {
//				studentRepo.delete(student);
//			}
//			else {
//				System.out.println(student);
//			}
//		}
		
		/*
		 * Student nameOfStudent = studentRepo.findByName("ADitya");
		 * System.out.println("student name ::"+nameOfStudent);
		 */
		
		/*
		 * System.out.println("Find by Address"); List<Student> findByAddress =
		 * studentRepo.findByAddress("sab jagah");
		 * System.out.println("Student Address ::"+findByAddress);
		 */
		
		/*
		 * String name = "laxmi"; String address = "sab jagah";
		 * System.out.println("FIND BY NAME AND ADDRESS"); List<Student>
		 * findByNameAndAddress = studentRepo.findByNameAndAddress(name, address);
		 * System.out.println(findByNameAndAddress);
		 */
		
		/*
		 * // custom query by JPA Student cusQuery =
		 * studentRepo.getStudentByNameAndAddress("Amartya", "Pagal khana");
		 * System.out.println(cusQuery);
		 */
		
		// pagination
		
		Sort sort = Sort.by("name").ascending();
		Pageable pageable = PageRequest.of(0, 3,sort);
		
		Page<Student> page = studentRepo.findAll(pageable);
		
		page.stream().forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("Page number ::"+page.getNumber());
		System.out.println("page size ::"+page.getSize());
		
		System.out.println("Total Elements ::"+page.getTotalElements());
		System.out.println("Total Pages ::"+page.getTotalPages());
		
	}

}
