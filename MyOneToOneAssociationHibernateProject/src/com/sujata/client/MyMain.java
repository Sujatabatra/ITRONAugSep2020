package com.sujata.client;

import com.sujata.bean.HusbandEntity;
import com.sujata.bean.WifeEntity;
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

//        HusbandEntity husbandEntity1=new HusbandEntity("h001","husband 1");
//        HusbandEntity husbandEntity2=new HusbandEntity("h002","husband 2");
//        HusbandEntity husbandEntity3=new HusbandEntity("h003","husband 3");
//
//        WifeEntity wifeEntity1=new WifeEntity("w001","wife1");
//        WifeEntity wifeEntity2=new WifeEntity("w002","wife2");
//        WifeEntity wifeEntity3=new WifeEntity("w003","wife3");
//
//        husbandEntity1.setWife(wifeEntity3);
//        husbandEntity2.setWife(wifeEntity2);
//        husbandEntity3.setWife(wifeEntity1);
//
//        wifeEntity1.setHusband(husbandEntity3);
//        wifeEntity2.setHusband(husbandEntity2);
//        wifeEntity3.setHusband(husbandEntity1);
//
//        session.save(husbandEntity1);
//        session.save(husbandEntity2);
//        session.save(husbandEntity3);
//
//        session.save(wifeEntity1);
//        session.save(wifeEntity2);
//        session.save(wifeEntity3);

        WifeEntity wifeEntity=(WifeEntity)session.get(WifeEntity.class,"w002");
        System.out.println(wifeEntity.getwName()+ " IS A WIFE OF "+wifeEntity.getHusband().gethName());

        transaction.commit();
        session.close();

    }
}
