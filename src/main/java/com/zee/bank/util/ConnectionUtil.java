package com.zee.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static Connection con;
    private static ConnectionUtil cu;
    private ConnectionUtil() {

    }
    public static ConnectionUtil getInstance() {
        if (cu == null) {
            cu = new ConnectionUtil();
        }
        return cu;
    }
    public Connection getConnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Pass@123");
            }                            
             catch (SQLException sql) {
                System.out.println("SQL Problem");
            } catch (Exception e) {
                System.out.println("Some other problem");
            }
        }
        
        return con;
    }
}
