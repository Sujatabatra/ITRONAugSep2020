package com.sujata.client;

import com.sujata.bean.Batch;
import com.sujata.bean.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory sessionFactory=meta.getSessionFactoryBuilder().build();

        Session session=sessionFactory.openSession();

        Transaction transaction=session.beginTransaction();

        StudentEntity studentEntity1=new StudentEntity(101,"AAAA");
        StudentEntity studentEntity2=new StudentEntity(102,"BBBB");
        StudentEntity studentEntity3=new StudentEntity(103,"CCCC");
        StudentEntity studentEntity4=new StudentEntity(104,"DDDD");
        StudentEntity studentEntity5=new StudentEntity(105,"EEEE");
        StudentEntity studentEntity6=new StudentEntity(106,"FFFF");
        StudentEntity studentEntity7=new StudentEntity(107,"GGGG");
        StudentEntity studentEntity8=new StudentEntity(108,"HHHH");

        Batch batch1=new Batch("B001","Java");
        Batch batch2=new Batch("B002","C++");

        studentEntity1.setBatch(batch1);
        studentEntity2.setBatch(batch2);
        studentEntity3.setBatch(batch1);
        studentEntity4.setBatch(batch2);
        studentEntity5.setBatch(batch1);
        studentEntity6.setBatch(batch2);
        studentEntity7.setBatch(batch1);
        studentEntity8.setBatch(batch2);

        batch1.setStudents(Arrays.asList(studentEntity1,studentEntity3,studentEntity5,studentEntity7));
        batch2.setStudents(Arrays.asList(studentEntity2,studentEntity4,studentEntity6,studentEntity8));

        session.save(studentEntity1);
        session.save(studentEntity2);
        session.save(studentEntity3);
        session.save(studentEntity4);
        session.save(studentEntity5);
        session.save(studentEntity6);
        session.save(studentEntity7);
        session.save(studentEntity8);

        session.save(batch1);
        session.save(batch2);

        transaction.commit();
        session.close();
    }
}
