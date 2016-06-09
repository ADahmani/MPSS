/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author yahyaz_rif
 */
public class JPADAOFactory extends DAOFactory {
      protected JPADAOFactory(){
        
    }

    @Override
    public JPADAOBoxAchete getBoxAcheteDao() {
        return JPADAOBoxAchete.getInstance();
    }

    @Override
    public JPADAOCommande getCommandeDao() {
        return JPADAOCommande.getInstance();
    }

    @Override
    public JPADAOLigneProd getLigneProductionDao() {
        return JPADAOLigneProd.getInstance();
    }

    @Override
    public JPADAOPile getPileDao() {
        return JPADAOPile.getInstance();
    }

    @Override
    public JPADAOProduit getProduitDao() {
        return JPADAOProduit.getInstance();
    }

    @Override
    public JPADAOPrdtCommande getProduitCommandeDao() {
        return JPADAOPrdtCommande.getInstance();
    }

    @Override
    public JPADAOBoxType getTypeBoxDao() {
        return JPADAOBoxType.getInstance();
    }

    @Override
    public JPADAOProduitType getTypeProduitDao() {
        return JPADAOProduitType.getInstance();
    }
    
}
