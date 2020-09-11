package com.sujata.service;

import java.util.List;
import java.util.Optional;

import com.sujata.bean.Employee;

public interface EmployeeService {

	public Optional<Employee> getEmployeeByID(int id);
	public List<Employee> getAllEmployees();
	
	public List<Employee> getAllEmployeesByName(String name);
}
