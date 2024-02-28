package com.springBoot.jsp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springBoot.jsp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	public Student findByName(String name);

	public List<Student> findByAddress(String address);
	
	public List<Student> findByNameAndAddress(String name, String address); 
	
	@Query("select u from Student u where u.name=?1 and u.address=?2")
	public Student getStudentByNameAndAddress(String nm, String ad);
	
}
