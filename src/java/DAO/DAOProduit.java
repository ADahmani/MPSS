/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.LigneProd;
import model.Produit;

/**
 *
 * @author yahyaz_rif
 */
public interface DAOProduit extends DAO<Produit> {
    
    public Produit findDernierProduitProd(LigneProd line); // renvoie le dernier produit á sortir de la ligne 
    
    

}
