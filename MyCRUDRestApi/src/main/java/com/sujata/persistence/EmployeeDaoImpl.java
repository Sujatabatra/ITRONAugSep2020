package com.sujata.persistence;

import com.sujata.bean.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private static List<Employee> employees=new ArrayList<>();
    static{
        employees.add(new Employee(101,"AAA","IT","Manager",78906));
        employees.add(new Employee(102,"BBB","Sales","Executive",80645));
        employees.add(new Employee(103,"CCC","Purchase","Associate",95606));
        employees.add(new Employee(104,"DDD","Sales","Sr. Associate",90611));
        employees.add(new Employee(105,"EEE","IT","Associate",89016));

    }

    @Override
    public List<Employee> getAllRecords() {
        return employees;
    }

    @Override
    public Employee getRecordById(int id) {
        for(Employee employee:employees){
            if(employee.getId()==id)
                return employee;
        }
        return null;
    }

    @Override
    public boolean addRecord(Employee employee) {
        return employees.add(employee);
    }

    @Override
    public Employee deleteRecord(int id) {
        Employee employee=getRecordById(id);
        boolean flag=employees.remove(employee);
        if(flag)
            return employee;
        return null;
    }

    @Override
    public Employee updateRecord(int id, Employee employee) {

        for(int index=0;index<employees.size();index++){
            if(employees.get(index).getId()==id){
                employees.set(index,employee);
                return employee;
            }
        }
        return null;
    }

}
