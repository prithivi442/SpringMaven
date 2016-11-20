/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.SpringRestMaven.Util;

import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Prithivi Raj
 */
@Repository
public class HibernateUtil {
    @Autowired
    private SessionFactory sessionFactory;
    
    public <T> Serializable create(final T entity) {
        return sessionFactory.getCurrentSession().save(entity);        
    }
    
    public <T> T update(final T entity) {
        sessionFactory.getCurrentSession().saveOrUpdate(entity);   
        return entity;
    }


    
    @SuppressWarnings("unchecked")  
    public <T> List<T> fetchAll(Class<T> entityClass) {        
        return sessionFactory.getCurrentSession().createQuery(" FROM "+entityClass.getName()).list();        
    }
  
    
    @SuppressWarnings("rawtypes")
    public <T> T fetchByUsername(String username, Class<T> entityClass) {
        return (T)sessionFactory.getCurrentSession().get(entityClass, username);
    }  
}
