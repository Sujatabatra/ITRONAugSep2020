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

        Transaction transaction=session.beginTransaction();
        EmployeeEntity employeeEntity1=new EmployeeEntity(101,"IT","Associate","AAAAA",67890);
        EmployeeEntity employeeEntity2=new EmployeeEntity(102,"Sales","Executive","BBBBB",89760);
        EmployeeEntity employeeEntity3=new EmployeeEntity(103,"Marketing","Manager","CCCCC",56789);

        session.save(employeeEntity1);
        session.save(employeeEntity2);
        session.save(employeeEntity3);


        transaction.commit();
        session.close();

    }
}
