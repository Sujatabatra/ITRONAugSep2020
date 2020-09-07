package com.sujata.service;

import com.sujata.bean.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    public EmployeeEntity getEmployee(int id);
    public boolean addEmployee(EmployeeEntity employeeEntity);
    public boolean updateEmployeeDesignation(int id,String designation);
    public boolean deleteEmployee(int id);
    public List<EmployeeEntity> getAllRecords();
    public List<Object[]> getNameDepartment(int id);
    public boolean deleteEmployeeByName(String name);
}
