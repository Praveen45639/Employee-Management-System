package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	public void saveEmployee(Employee employee);
	public Employee getEmployeeById(long id);
	public void deleteEmployeeById(long id);
	

}
