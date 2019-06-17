package com.andychylde.schoolsmanager;

import com.andychylde.schoolsmanager.utils.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Femi Falase
 * @version 0.0.1
 */
public class SchoolsManagerTester {

    public static void main(String[] args) {

//        Creating a person
        Person aPerson = new Person();
       
        aPerson.getPersonName().setFamilyname("Falase");
        aPerson.getPersonName().setFirstname("Adefemi");
        aPerson.getPersonName().setMiddlename("");
       
        
//        Creating a school
        School aSchool = new School("GCI");
//        Persisting a school
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        // begin a transaction
        try (Session session = sessionFactory.openSession()) {
            // begin a transaction
            session.getTransaction().begin();
            session.save(aPerson);
            System.out.println("Person saved, id: " + aPerson.getPersonId());
            // commit transaction
            session.getTransaction().commit();
        }
        
        HibernateUtil.shutdown();

    }

}
