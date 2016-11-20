/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.SpringRestMaven.Service;

import com.mycompany.SpringRestMaven.entity.Customer;
import java.util.List;

/**
 *
 * @author Prithivi Raj
 */
public interface ServiceLayer {
    void insert(Customer s);
    void update(Customer s);

    List<Customer> getAll();
    Customer searchByUsername(String username);
}
