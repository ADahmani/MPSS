/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author yahyaz_rif
 * @param <T>
 */
public interface DAO<T> {
    public boolean create(T obj) ;
    public T find (Integer id) ;
    public List<T> findAll() ;
    public boolean update (T obj) ;
    public boolean delete (T obj) ;
    public boolean deleteAll() ;
    public void close();
}
