/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.SpringRestMaven.DAO;

import com.mycompany.SpringRestMaven.Util.HibernateUtil;
import com.mycompany.SpringRestMaven.entity.Customer;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Prithivi Raj
 */
@Repository
public class CustomerDAOImpl implements CustomersDAO {

    public CustomerDAOImpl() {
        System.out.println("CustomerDAOImpl");
    }

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public void insert(Customer s) {
        hibernateUtil.create(s);

    }

    @Override
    public void update(Customer s) {
        hibernateUtil.update(s);
    }

    @Override
    public List<Customer> getAll() {
        return hibernateUtil.fetchAll(Customer.class);
    }

    @Override
    public Customer searchByUsername(String username) {
        return hibernateUtil.fetchByUsername(username, Customer.class);
    }
}
