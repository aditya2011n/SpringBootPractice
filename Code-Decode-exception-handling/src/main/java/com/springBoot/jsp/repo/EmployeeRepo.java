package com.springBoot.jsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jsp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
