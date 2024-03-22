package br.com.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {

    public static EntityManagerFactory factory = null;


    static {
        init();
    }

    private static void init() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory("jpaproject");
        }
    }

    public static EntityManager getEntityManager(){
            return factory.createEntityManager(); // Prove parte de persistência.


    }
}
