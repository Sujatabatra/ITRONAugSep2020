package com.sujata.client;

import com.sujata.bean.Address;
import com.sujata.bean.AuthorEntity;
import com.sujata.bean.BookEntity;
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
        BookEntity bookEntity1=new BookEntity("B001","First Book",890,1500);
        BookEntity bookEntity2=new BookEntity("B002","Second Book",540,1000);
        BookEntity bookEntity3=new BookEntity("B003","Third Book",720,899);
        BookEntity bookEntity4=new BookEntity("B004","Fourth Book",1200,700);
        BookEntity bookEntity5=new BookEntity("B005","Fifth Book",1560,1860);
        BookEntity bookEntity6=new BookEntity("B006","Sixth Book",1870,1432);

        AuthorEntity authorEntity1=new AuthorEntity("A001","AAAAA");
        AuthorEntity authorEntity2=new AuthorEntity("A002","BBBBB");
        AuthorEntity authorEntity3=new AuthorEntity("A003","CCCCC");
        authorEntity1.setAddress(new Address(101,"Street 1","City 1","State 1","pincode1"));
        authorEntity2.setAddress(new Address(102,"Street 2","City 2","State 2","pincode2"));
        authorEntity3.setAddress(new Address(103,"Street 3","City 3","State 3","pincode3"));

        authorEntity1.setBooks(Arrays.asList(bookEntity1,bookEntity3,bookEntity6));
        authorEntity2.setBooks(Arrays.asList(bookEntity2,bookEntity4,bookEntity6));
        authorEntity3.setBooks(Arrays.asList(bookEntity1,bookEntity2,bookEntity4,bookEntity5));

        bookEntity1.setAuthors(Arrays.asList(authorEntity1,authorEntity3));
        bookEntity2.setAuthors(Arrays.asList(authorEntity2,authorEntity3));
        bookEntity3.setAuthors(Arrays.asList(authorEntity1));
        bookEntity4.setAuthors(Arrays.asList(authorEntity2,authorEntity3));
        bookEntity5.setAuthors(Arrays.asList(authorEntity3));
        bookEntity6.setAuthors(Arrays.asList(authorEntity1,authorEntity2));

        session.save(bookEntity1);
        session.save(bookEntity2);
        session.save(bookEntity3);
        session.save(bookEntity4);
        session.save(bookEntity5);
        session.save(bookEntity6);
        session.save(authorEntity1);
        session.save(authorEntity2);
        session.save(authorEntity3);

        transaction.commit();
        session.close();
    }
}
