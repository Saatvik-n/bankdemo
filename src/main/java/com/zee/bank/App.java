package com.zee.bank;

import java.util.List;
import java.util.Scanner;

import com.zee.bank.beans.Customer;
import com.zee.bank.service.CustomerService;

public class App {
    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("HI");
        try {
            CustomerService cService = new CustomerService();
            while (true) {
                System.out.println("1 - Add new customer \n2 - View all customers \n3 - Exit");
                int ch = in.nextInt();
                in.nextLine();
                switch (ch) {
                    case 1:
                        Customer c = generateCustomer();
                        cService.addCustomer(c);
                        break;
                    case 2:
                        var customers = cService.getCustomers();
                        displayCustomers(customers);
                        break;
                    case 3:
                        in.close();
                        System.exit(0);
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Some error happened");
        }
    }

    private static Customer generateCustomer() {
        System.out.println("Enter name");
        String name = in.nextLine();
        System.out.println("Enter phone");
        String phone = in.nextLine();
        System.out.println("Enter balance");
        int bal = in.nextInt();
        in.nextLine();
        return new Customer(name, bal, phone);
    }

    private static void displayCustomers(List<Customer> customers) {
        System.out.println("Customer Details:");
        System.out.println("Account\tName\tPhone\tBalance");
        System.out.println("-------------------------------------------------");
        System.out.println();
        for (int i = 0; i < customers.size(); i++) {
            Customer cur = customers.get(i);
            System.out.println(cur.getName() + "\t" + cur.getName() + "\t" + cur.getPhone() + "\t" + cur.getBalance());
        }
    }
}
