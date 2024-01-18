package org.info;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateTest {
    EntityManagerFactory emFabrica= Persistence.createEntityManagerFactory("atv");
    EntityManager em = emFabrica.createEntityManager();
    @Test

    void save_new_cliente() {

        Cliente cliente = new Cliente(3, "Anderson", "Rua C , 144", "144-1667");

        em.persist(cliente);
    }
}