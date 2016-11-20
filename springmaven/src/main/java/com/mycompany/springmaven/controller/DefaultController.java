/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmaven.controller;

import com.mycompany.SpringRestMaven.Service.ServiceLayer;
import com.mycompany.SpringRestMaven.entity.Customer;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Prithivi Raj
 */
@RestController
public class DefaultController {

//    private static final Logger logger = Logger.getLogger(DefaultController.class);
//    
//    public DefaultController() {
//        System.out.println("DefaultController()");
//    }
    @Autowired
    private ServiceLayer customerService;

    @RequestMapping("createCustomers")
    public ModelAndView createEmployee(@ModelAttribute Customer c) {
//        logger.info("Creating Customers. Data: "+customer);
        return new ModelAndView("customerForm");
    }

    @RequestMapping("editCustomers")
    public ModelAndView editEmployee(@RequestParam String username, @ModelAttribute Customer customer) {
        customer = customerService.searchByUsername(username);
        return new ModelAndView("employeeForm", "employeeObject", customer);
    }

    @RequestMapping("saveCustomer")
    public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
        if (customer.getUsername().equals(null)) { // if employee id is 0 then creating the employee other updating the employee
            customerService.insert(customer);
        } else {
            customerService.update(customer);
        }
        return new ModelAndView("redirect:getAllCustomer");
    }

    @RequestMapping(value = {"getAllCustomer", "/"})
    public ModelAndView getAllCustomer() {
        List<Customer> customerList = customerService.getAll();
        return new ModelAndView("customerList", "customerList", customerList);
    }

    @RequestMapping("searchEmployee")
    public ModelAndView searchEmployee(@RequestParam("searchName") String searchName) {
        Customer customer = customerService.searchByUsername(searchName);
        return new ModelAndView("customer", "customer", customer);
    }
}
