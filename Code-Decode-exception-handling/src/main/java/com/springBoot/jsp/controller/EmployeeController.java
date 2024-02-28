package com.springBoot.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.jsp.entity.Employee;
import com.springBoot.jsp.repo.EmployeeRepo;
import com.springBoot.jsp.service.EmployeeServiceInter;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceInter employeeServiceInter;
	
	@GetMapping
	public String showData() {
		return "show data";
	}
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		Employee saveEmpData = employeeServiceInter.saveData(employee);
		return new ResponseEntity<Employee>(saveEmpData, HttpStatus.CREATED);
	}
	
	@GetMapping("/allDataFetch")
	public ResponseEntity<List<Employee>> getAllData() {
		List<Employee> allData = employeeServiceInter.getAllData();
		return new ResponseEntity<>(allData, HttpStatus.OK);
	}
	
	@get

}
