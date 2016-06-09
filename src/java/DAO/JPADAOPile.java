/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Pile;

/**
 *
 * @author yahyaz_rif
 */
public class JPADAOPile extends JpaDao<Pile> implements DAOPile{
    
    private static JPADAOPile instance;
    
    private JPADAOPile() {
        
    }
    
    protected static JPADAOPile getInstance() {
        if(instance == null)
            instance = new JPADAOPile();
        return instance;
    }
    
    @Override
    public Pile find(long id) {
        return em.find(Pile.class, Integer.valueOf((int) id));
    }

    @Override
    public Pile find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pile> findAll() {
        return em.createNamedQuery("Pile.findAll").getResultList();
    }

    @Override
    public boolean deleteAll() {
        em.createNamedQuery("Pile.deleteAll").executeUpdate();
        return true;
    }
    
}
