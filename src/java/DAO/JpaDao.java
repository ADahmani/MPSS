/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
/**
 *
 * @author yahyaz_rif
 * @param <T>
 */
public abstract class JpaDao<T> implements DAO<T> {

    protected EntityManager em;
    EntityManagerFactory emf;
    protected final static String PERSISTENCE_UNIT = "ProjetPU";

    public JpaDao() {
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        em = emf.createEntityManager();
    }
    
    public abstract T find(long id);
      @Override
    public boolean create(T t) {
        EntityTransaction et = em.getTransaction();
        
        try {
            et.begin();
            em.persist(t);
            et.commit();
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(T t) {
        EntityTransaction et = em.getTransaction();
        
        try {
            et.begin();
            em.merge(t);
            et.commit();
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(T t) {
        EntityTransaction et = em.getTransaction();
        
        try {
            et.begin();
            em.remove(t);
            et.commit();
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    @Override
    public void close () {
        if(em != null && em.isOpen()) {
            em.close();
        } 
        if(emf != null && emf.isOpen()) {  
            emf.close();
        }
    }

    

    
}
