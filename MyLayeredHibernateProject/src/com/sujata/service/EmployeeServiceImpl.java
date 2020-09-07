package com.sujata.service;

import com.sujata.bean.EmployeeEntity;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao=new EmployeeDaoImpl();
    @Override
    public EmployeeEntity getEmployee(int id) {
        return employeeDao.getRecord(id);
    }

    @Override
    public boolean addEmployee(EmployeeEntity employeeEntity) {
        return employeeDao.addRecord(employeeEntity);
    }

    @Override
    public boolean updateEmployeeDesignation(int id, String designation) {
        return employeeDao.updateDesignation(id,designation);
    }

    @Override
    public boolean deleteEmployee(int id) {
        EmployeeEntity employeeEntity=employeeDao.getRecord(id);
        if(employeeEntity!=null)
            return employeeDao.deleteRecord(employeeEntity);
        return false;
    }

    @Override
    public List<EmployeeEntity> getAllRecords() {
        return employeeDao.getAllRecords();
    }

    @Override
    public List<Object[]> getNameDepartment(int id) {
        return employeeDao.getNameDepartment(id);
    }

    @Override
    public boolean deleteEmployeeByName(String name) {
        return employeeDao.deleteRecordByName(name);
    }
}
