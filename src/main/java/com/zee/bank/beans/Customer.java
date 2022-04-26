package com.zee.bank.beans;

public class Customer {
    private String name;
    private String accountNo;
    private int balance;
    private String phone;
    public Customer() {
        
    }
    public Customer(String name, int balance, String phone) {
        this.name = name;
        this.balance = balance;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
