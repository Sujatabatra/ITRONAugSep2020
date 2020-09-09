package com.sujata.persistence;

import com.sujata.bean.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllRecords();
    public Employee getRecordById(int id);
    public boolean addRecord(Employee employee);
    public Employee deleteRecord(int id);
    public Employee updateRecord(int id,Employee employee);
}
