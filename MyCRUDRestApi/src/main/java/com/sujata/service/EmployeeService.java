package com.sujata.service;

import com.sujata.bean.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public boolean addEmployee(Employee employee);
    public Employee deleteEmployee(int id);
    public Employee updateRecord(int id, Employee employee);
}
