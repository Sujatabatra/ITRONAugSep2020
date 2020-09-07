package com.sujata.persistence;

import com.sujata.bean.EmployeeEntity;
import com.sujata.helper.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public EmployeeEntity getRecord(int id) {
        Session session= MySessionFactory.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();

        EmployeeEntity employeeEntity=(EmployeeEntity)session.get(EmployeeEntity.class,id);

        transaction.commit();
        session.close();
        return employeeEntity;
    }

    @Override
    public boolean addRecord(EmployeeEntity employeeEntity) {
        Session session= MySessionFactory.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();

        session.save(employeeEntity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean updateDesignation(int id, String designation) {
        Session session= MySessionFactory.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();

        EmployeeEntity employeeEntity=(EmployeeEntity)session.get(EmployeeEntity.class,id);
        employeeEntity.setDesig(designation);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean deleteRecord(EmployeeEntity employeeEntity) {

        Session session= MySessionFactory.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();

        session.delete(employeeEntity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<EmployeeEntity> getAllRecords() {
        Session session= MySessionFactory.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();

        Query query=session.createQuery("from EmployeeEntity ");
        List<EmployeeEntity> employees=query.getResultList();

        transaction.commit();
        session.close();

        return employees;
    }


    @Override
    public List<Object[]> getNameDepartment(int id){
        Session session= MySessionFactory.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();

        Query query=session.createQuery("select ename,deptt from EmployeeEntity where eid=:i ");
        query.setParameter("i",id);
        List<Object[]> employees=query.getResultList();

        transaction.commit();
        session.close();

        return employees;
    }

    @Override
    public boolean deleteRecordByName(String name) {
        Session session= MySessionFactory.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();

        Query query=session.createQuery("delete from EmployeeEntity where ename=:na");
        query.setParameter("na",name);
        int result=query.executeUpdate();

        transaction.commit();
        session.close();
        if(result>0)
            return true;
        return false;
    }
}
