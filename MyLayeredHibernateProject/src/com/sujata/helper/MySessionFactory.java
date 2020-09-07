package com.sujata.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MySessionFactory {

    public static SessionFactory getSessionFactory(){
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory sessionFactory=meta.getSessionFactoryBuilder().build();
        return sessionFactory;
    }
}
