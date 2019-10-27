package com.andychylde.schoolsmanager;

/**
 *
 * @author Femi Falase
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("Success....Session Factory Built");

        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }//end of static initialiser

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
// Close caches and connection pools
        getSessionFactory().close();
    }

}
