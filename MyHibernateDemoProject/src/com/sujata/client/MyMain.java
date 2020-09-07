package com.sujata.client;

import com.sujata.bean.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MyMain {

    public static void main(String[] args) {
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory sessionFactory=meta.getSessionFactoryBuilder().build();

        Session session=sessionFactory.openSession();
        //Transient State
//        EmployeeEntity employeeEntity=new EmployeeEntity(102,"IT","Sr. Associate","Fourth Employee",78906);
        Transaction transaction=session.beginTransaction();

        EmployeeEntity employeeEntity=(EmployeeEntity)session.get(EmployeeEntity.class,102); //Persistent
        System.out.println(employeeEntity);
        employeeEntity.setEname("Sarthak");

        transaction.commit();
        session.close();
        // Detached State
        employeeEntity.setEname("Geeta");

        session=sessionFactory.openSession();
        transaction=session.beginTransaction();

        session.update(employeeEntity);
        //Persistent
        transaction.commit();
        session.close();
    }
}
