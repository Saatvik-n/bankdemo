package com.zee.bank.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zee.bank.beans.Customer;
import com.zee.bank.dao.CustomerDAO;

public class CustomerService {
    private CustomerDAO cDao;
    public CustomerService() {
        cDao = new CustomerDAO();
    }
    public boolean addCustomer(Customer c) {
        c.setAccountNo(String.valueOf((long)(Math.random() * 1000000)));
        return cDao.addCustomer(c);
    }

    public List<Customer> getCustomers() {
        ResultSet rs = cDao.getCustomers();
        if (rs == null) {
            return null;
        } 
        List<Customer> customers = new ArrayList<Customer>();
        try {
            while (rs.next()) {
                Customer c = new Customer();
                c.setAccountNo(rs.getString(1));
                c.setBalance(rs.getInt(4));
                c.setPhone(rs.getString(3));
                c.setName(rs.getString(2));
                customers.add(c);
            }    
        } catch (Exception e) {
            //TODO: handle exception
        }
        return customers;
        
    }
}
