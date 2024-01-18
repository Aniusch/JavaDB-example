package org.info;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class program {
    public static void main(String[] args){

        Cliente cliente = new Cliente(3, "Anderson", "Rua C , 144", "144-1667");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aicredo");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();

        System.out.println("cabou");
    }
}
