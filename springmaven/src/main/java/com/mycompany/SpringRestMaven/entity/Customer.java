/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.SpringRestMaven.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Prithivi Raj
 */
@Entity
@Table(name = "credentials")
public class Customer implements Serializable {

    private static final long serialVersionUID = -7988799579036225137L;


    @Column
    private String name;

    @Column
    private String address;

    @Column
    private double phone_no;
     
    @Column
    private String email;
    
    @Column
    private String username;
    
    @Column
    private String password;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    
    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(double phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + ", phone_no=" + phone_no + ", email=" + email + ", username=" + username + ", password=" + password + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
