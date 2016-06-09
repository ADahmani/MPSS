/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.ProduitType;

/**
 *
 * @author yahyaz_rif
 */
public class JPADAOProduitType extends JpaDao<ProduitType> implements DAOProduitType{

    private static JPADAOProduitType instance;
    
    private JPADAOProduitType() {
        
    }
    
    protected static JPADAOProduitType getInstance() {
        if(instance == null)
            instance = new JPADAOProduitType();
        return instance;
    }
    
    @Override
    public ProduitType find(long id) {
        return em.find(ProduitType.class, Integer.valueOf((int) id));
    }

    @Override
    public ProduitType find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProduitType> findAll() {
        return em.createNamedQuery("ProduitType.findAll").getResultList();
    }

    @Override
    public boolean deleteAll() {
        em.createNamedQuery("ProduitType.deleteAll").executeUpdate();
        return true;
    }
    
}
