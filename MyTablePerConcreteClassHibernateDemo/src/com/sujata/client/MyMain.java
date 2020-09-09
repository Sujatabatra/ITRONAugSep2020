package com.sujata.client;

import com.sujata.bean.BussinessMan;
import com.sujata.bean.Employee;
import com.sujata.bean.Person;
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
        Person person=new Person("P001","AAAAA");
        Employee employee=new Employee("P002","BBBBBB","Associate","Sales",78906);
        BussinessMan bussinessMan=new BussinessMan("P003","CCCCC","Retail",8907654);


        session.save(person);
        session.save(employee);
        session.save(bussinessMan);

        transaction.commit();
        session.close();
    }
}
