package com.sujata.persistence;

import com.sujata.bean.EmployeeEntity;

import java.util.List;

public interface EmployeeDao {

    public EmployeeEntity getRecord(int id);
    public boolean addRecord(EmployeeEntity employeeEntity);
    public boolean updateDesignation(int id,String designation);
    public boolean deleteRecord(EmployeeEntity employeeEntity);
    public List<EmployeeEntity> getAllRecords();
    public List<Object[]> getNameDepartment(int id);
    public boolean deleteRecordByName(String name);
}
