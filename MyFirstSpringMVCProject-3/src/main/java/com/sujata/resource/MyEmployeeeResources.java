package com.sujata.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@RestController
public class MyEmployeeeResources {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path="/employees/{id}",produces="application/json")
	public Employee getEmpById(@PathVariable("id") int id){
//		Employee emp;
//		Optional<Employee> e=employeeService.getEmployeeByID(id);
//		emp=e.get();
		return employeeService.getEmployeeByID(id).get();
		
	}
	
	@GetMapping(path="/employees",produces="application/json")
	public List<Employee> getAllEmps(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping(path="/employeesbyname/{name}",produces="application/json")
	public List<Employee> getAllEmpsByName(@PathVariable("name") String name){
		return employeeService.getAllEmployeesByName(name);
	}
}
