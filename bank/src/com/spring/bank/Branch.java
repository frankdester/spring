package com.spring.bank;

import java.util.ArrayList;

public class Branch {
    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return this.customers;
    }
    public boolean newCustomer(String nameOfCustomer,double initialTransaction){
        if(findCustomer(nameOfCustomer) == null){
            Customer customer = new Customer(nameOfCustomer, initialTransaction);
            this.customers.add(customer);
            return true;
        }
        System.out.println(nameOfCustomer+" already exist!");
        return false;
    }
    public boolean addCustomerTransaction(String nameOfCustomer, double initialTransaction){
        if(findCustomer(nameOfCustomer) != null){
            for (Customer customer : this.customers) {
                if (nameOfCustomer.equals(customer.getName())) {
                    customer.addTransaction(initialTransaction);
                    return true;
                }
            }
        }
        System.out.println(nameOfCustomer+" doesn't exist!");
        return false;
    }
    private Customer findCustomer(String nameOfCustomer){
        for (Customer customer  : this.customers) {
            if (nameOfCustomer.equals(customer.getName())) {
                return customer;
            }
        }
        return null;
    }
}
