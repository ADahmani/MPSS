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
public interface DAOBoxAchete extends DAO<BoxAchete> {
    
    public List<BoxAchete> findBoxesByTypeBox(BoxType typeBox);

}
