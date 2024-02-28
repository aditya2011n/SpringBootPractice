package com.springBoot.jsp.service;

import java.util.List;

import com.springBoot.jsp.entity.Employee;

public interface EmployeeServiceInter {

	public Employee saveData(Employee employee);

	public List<Employee> getAllData();

}
