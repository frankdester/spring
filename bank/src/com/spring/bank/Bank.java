package com.spring.bank;

public interface Bank {
    public boolean listCustomers(String nameOfBranch, boolean printTransaction);
    public boolean addBranch(String nameOfNewBranch);
    public boolean addCustomer(String nameOfExistingBranch,String nameCustomer,double initialTransaction);
    public boolean addCustomerTransaction(String nameOfBranch,String nameCustomer,double initialTransaction);
    public String getName();

}
