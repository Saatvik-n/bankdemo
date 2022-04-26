package com.zee.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zee.bank.beans.Customer;
import com.zee.bank.util.ConnectionUtil;

public class CustomerDAO {
    private Connection con;
    public CustomerDAO() {
        con = ConnectionUtil.getInstance().getConnection();
    }
    public boolean addCustomer(Customer c) {
        try {
            PreparedStatement p = con.prepareStatement("INSERT INTO customer VALUES()");
            p.setString(1, c.getAccountNo());
            p.setString(2, c.getName());
            p.setString(3, c.getPhone());
            p.setInt(4, c.getBalance());
            p.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }

    } 
    public ResultSet getCustomers() {
        ResultSet rs = null;
        try {
            Statement s = con.createStatement();
            rs = s.executeQuery("SELECT * FROM customer");
        } catch (Exception e) {
            
        }
        return rs;
    }
}
