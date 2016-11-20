/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.SpringRestMaven.Service;

import com.mycompany.SpringRestMaven.DAO.CustomersDAO;
import com.mycompany.SpringRestMaven.entity.Customer;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author Prithivi Raj
 */
@Service("customerService")
public class ServiceImpl implements ServiceLayer {

    public ServiceImpl() {
        System.out.println("CustomerServiceImpl()");
    }
    @Autowired
    CustomersDAO customerDao;

    @Transactional
    @Override
    public void insert(Customer s) {
        customerDao.insert(s);
    }

    @Transactional
    @Override
    public void update(Customer s) {
        customerDao.update(s);
    }


    @Transactional
    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Transactional
    @Override
    public Customer searchByUsername(String username) {
        return customerDao.searchByUsername(username);
    }

}
