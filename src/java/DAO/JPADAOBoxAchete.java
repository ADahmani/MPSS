/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.BoxAchete;
import model.BoxType;

/**
 *
 * @author yahyaz_rif
 */
public class JPADAOBoxAchete extends JpaDao<BoxAchete> implements DAOBoxAchete {
    private static JPADAOBoxAchete instance;
    
    private JPADAOBoxAchete() {
        
    }
    
    protected static JPADAOBoxAchete getInstance() {
        if(instance == null)
            instance = new JPADAOBoxAchete();
        return instance;
    }

    @Override
    public BoxAchete find(long id) {
        return em.find(BoxAchete.class,Integer.valueOf((int) id));
    }

    @Override
    public BoxAchete find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public List<BoxAchete> findAll() {
        return em.createNamedQuery("BoxAchete.findAll").getResultList();
    }
    
    // Supprime toutes les box
    @Override
    public boolean deleteAll() {
       em.createNamedQuery("BoxAchete.deleteAll").executeUpdate();
       return true;
    }

    // Trouve une box par son type
    @Override
    public List<BoxAchete> findBoxesByTypeBox(BoxType typeBox) {
        return em.createNamedQuery("BoxAchete.findBoxesByTypeBox").setParameter("id", typeBox.getId()).getResultList();
    }

}
