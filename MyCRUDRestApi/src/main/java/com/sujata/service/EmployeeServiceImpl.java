package com.sujata.service;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao=new EmployeeDaoImpl();
    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllRecords();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDao.getRecordById(id);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employeeDao.addRecord(employee);
    }

    @Override
    public Employee deleteEmployee(int id) {
        return employeeDao.deleteRecord(id);
    }

    @Override
    public Employee updateRecord(int id, Employee employee) {
        return employeeDao.updateRecord(id,employee);
    }
}
