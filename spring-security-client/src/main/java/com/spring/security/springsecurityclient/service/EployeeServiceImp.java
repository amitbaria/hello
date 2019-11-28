package com.spring.security.springsecurityclient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.springsecurityclient.model.Employee;
//import com.spring.security.springsecurityclient.repository.EmployeeRepository;

@Service
public class EployeeServiceImp {
	
	
	//@Autowired
	//private EmployeeRepository employeeRepository;
	
	private static List<Employee> employee=null;
	public static List<Employee> getEmployee() {
		return employee;
	}
	public static void setEmployee(List<Employee> employee) {
		EployeeServiceImp.employee = employee;
	}
	static
	{
		employee=new ArrayList<Employee>();
	
		employee.add(new Employee(102,"Rajan","222","55555"));
		employee.add(new Employee(103,"Rajan","222","55555"));
		employee.add(new Employee(104,"Rajan","222","55555"));
		employee.add(new Employee(105,"Rajan","222","55555"));
		employee.add(new Employee(106,"Rajan","222","55555"));
	}
	
	public List<Employee> getAllEmployeeDetails()
	{
		 return getEmployee();
		
	}
	
	

}
