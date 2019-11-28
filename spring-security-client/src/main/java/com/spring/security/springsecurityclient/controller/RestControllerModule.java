package com.spring.security.springsecurityclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.springsecurityclient.model.Employee;
//import com.spring.security.springsecurityclient.repository.EmployeeRepository;
import com.spring.security.springsecurityclient.service.EployeeServiceImp;




@RestController
public class RestControllerModule {
	
	@Autowired
	private EployeeServiceImp  EployeeServiceImpService;
	
	@GetMapping("/employeeDetails")
	public ResponseEntity<List<Employee>> showDetails()
	{
		  List<Employee> employee=EployeeServiceImpService.getAllEmployeeDetails();
		  
		  return new ResponseEntity<List<Employee>>(employee,new HttpHeaders(),HttpStatus.OK);
		  
		
	}
	
	
	

}
