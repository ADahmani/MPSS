/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.DAOCommande;
import DAO.DAOFactory;
import DAO.DAOProduitType;
import DAO.JPADAOFactory;
import model.Commande;
import model.ProduitType;

/**
 *
 * @author yahyaz_rif
 */
public class testDAO {
    
    public static void main(String[] args){
            JPADAOFactory df = (JPADAOFactory) DAOFactory.getDaoFactory(DAOFactory.PersistType.JPA);
            DAOProduitType pt = df.getTypeProduitDao();
            DAOCommande ct = df.getCommandeDao();
            ProduitType p = new ProduitType();
            p.setId("BOX01");
            p.setHauteur(2);
            p.setLongueur(3);
            p.setNbEmpileMax(2);
            pt.create(p);
            
            Commande c = new Commande();
            c.setId("COM01");
            ct.create(c);
    }
}

