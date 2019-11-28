package com.spring.security.springsecurityclient.model;

import javax.persistence.Entity;
import javax.persistence.Id;



public class Employee
{
	private String name;
	private String  salary;
	private String address; 
	
	
	private Integer id;
	public Employee(Integer id,String name,String  salary,String address)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.address=address;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
