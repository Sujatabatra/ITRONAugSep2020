package com.sujata.client;

import com.sujata.bean.Employee;
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

        Employee employee1=new Employee(101,"First Employee","Sales","Manager",89076);
        Employee employee2=new Employee(102,"Second Employee","Purchase","Associate",56780);
        Employee employee3=new Employee(103,"Third Employee","Marketing","Executive",67890);

        session.save(employee1);
        session.save(employee2);
        session.save(employee3);

        transaction.commit();
        session.close();

    }

}
