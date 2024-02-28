package com.springBoot.jsp.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jsp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
