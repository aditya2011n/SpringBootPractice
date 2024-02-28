package com.springBoot.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.jsp.entity.Employee;
import com.springBoot.jsp.repo.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeServiceInter{

	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public Employee saveData(Employee employee) {
		// TODO Auto-generated method stub
		Employee saveEmpData = employeeRepo.save(employee);
		return saveEmpData;
	}

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		List<Employee> allData = employeeRepo.findAll();
		return allData;
	}
	
}
