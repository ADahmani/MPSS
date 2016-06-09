/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.BoxType;

/**
 *
 * @author yahyaz_rif
 */
public class JPADAOBoxType extends JpaDao<BoxType> implements DAOBoxType{
    private static JPADAOBoxType instance;
    
    private JPADAOBoxType() {
        
    }
    
    protected static JPADAOBoxType getInstance() {
        if(instance == null)
            instance = new JPADAOBoxType();
        return instance;
    }
    @Override
    public BoxType find(long id) {
        return em.find(BoxType.class, Integer.valueOf((int) id));
    }

    @Override
    public BoxType find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BoxType> findAll() {
        return em.createNamedQuery("BoxType.findAll").getResultList();
    }
    // Supprime tout les type de box
    @Override
    public boolean deleteAll() {
        em.createNamedQuery("BoxType.deleteAll").executeUpdate();
        return true;
    }
    // Retrouve la premiére box avec les dimensions requises
    @Override
    public BoxType findFirstByLH(int l, int h) {
        return (BoxType) em.createNamedQuery("BoxType.findFirstByLH").setParameter("lbox", l).setParameter("hbox", h).getResultList().get(0);
    }
    
}
