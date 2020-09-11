package com.sujata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Optional<Employee> getEmployeeByID(int id) {
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>)employeeDao.findAll();
		
	}

	@Override
	public List<Employee> getAllEmployeesByName(String name) {
		
		return employeeDao.findByName(name);
	}

}
