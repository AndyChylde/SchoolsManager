package com.andychylde.schoolsmanager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author FEMI
 */
public class SchoolsManagerTester {

    public static void main(String[] args) {

//        Creating a school
        School aSchool = new School("GCI");
//        Persisting a school
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        // begin a transaction
        session.getTransaction().begin();
        session.save(aSchool);
        System.out.println("School saved, id: " + aSchool.getSchoolId());
        // commit transaction
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();

    }

}
