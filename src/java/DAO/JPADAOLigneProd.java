/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.LigneProd;

/**
 *
 * @author yahyaz_rif
 */
public class JPADAOLigneProd extends JpaDao<LigneProd> implements DAOLigneProd {

    private static JPADAOLigneProd instance;
    
    private JPADAOLigneProd() {
        
    }
    
    protected static JPADAOLigneProd getInstance() {
        if(instance == null)
            instance = new JPADAOLigneProd();
        return instance;
    }
    
    @Override
    public LigneProd find(long id) {
        return em.find(LigneProd.class, Integer.valueOf((int) id));
    }

    @Override
    public LigneProd find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LigneProd> findAll() {
        return em.createNamedQuery("LigneProd.findAll").getResultList();
    }

    @Override
    public boolean deleteAll() {
        em.createNamedQuery("LigneProd.deleteAll").executeUpdate();
        return true;
    }
    
}
