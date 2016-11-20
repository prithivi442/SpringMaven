/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.SpringRestMaven.DAO;

import com.mycompany.SpringRestMaven.entity.Customer;
import java.util.List;

/**
 *
 * @author Prithivi Raj
 */
public interface CustomersDAO {
    void insert(Customer c);
    void update(Customer c);
    List<Customer> getAll();
    Customer searchByUsername(String username);
}
