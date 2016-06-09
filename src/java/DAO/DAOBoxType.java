/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.BoxType;

/**
 *
 * @author yahyaz_rif
 */
public interface DAOBoxType extends DAO<BoxType>{
    
    public BoxType findFirstByLH(int l, int h); // trouve la premiére box avec les 
                                                      // dimensions requises

}
