/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Commande;
import model.ProduitCommande;

/**
 *
 * @author yahyaz_rif
 */
public class JPADAOPrdtCommande extends JpaDao<ProduitCommande> implements DAOPrdtCommand {
    
    private static JPADAOPrdtCommande instance;
    
    private JPADAOPrdtCommande() {
        
    }
    
    protected static JPADAOPrdtCommande getInstance() {
        if(instance == null)
            instance = new JPADAOPrdtCommande();
        return instance;
    }

    @Override
    public ProduitCommande find(long id) {
        return em.find(ProduitCommande.class, Integer.valueOf((int) id));
    }

    @Override
    public ProduitCommande find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProduitCommande> findAll() {
        return em.createNamedQuery("ProduitCommande.findAll").getResultList();
    }

    @Override
    public boolean deleteAll() {
        em.createNamedQuery("ProduitCommande.deleteAll").executeUpdate();
        return true;
    }

    @Override
    public List<ProduitCommande> findProduitByCommande(Commande c) {
        return em.createNamedQuery("ProduitCommande.findAllOfCommande").setParameter("commande", c).getResultList();
    }
    
}
