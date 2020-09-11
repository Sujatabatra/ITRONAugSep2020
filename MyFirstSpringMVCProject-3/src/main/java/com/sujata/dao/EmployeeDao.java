package com.sujata.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
	@Query("from Employee where ename=:ename")
	public List<Employee> findByName(@Param("ename")String name);
	
//	public Employee getRecordByID(int id);
//	public List<Employee> getAllRecords();
}
