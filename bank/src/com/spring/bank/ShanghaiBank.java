package com.spring.bank;

import java.util.ArrayList;

public class ShanghaiBank implements Bank {
    private String name;
    private ArrayList<ParisBranch> branches;//group de branches

    public ShanghaiBank(String name){ //to initialise our bank's name, permission to create our bank/ a new bank
        this.name = name;
        this.branches = new ArrayList<ParisBranch>(); // to instantiate (new branch)

    }
    public ShanghaiBank(){
        System.out.println("Shanghai");

    }

    public boolean addBranch(String nameOfNewBranch){ // add branches to your banks
        if(findBranch(nameOfNewBranch) == null){
            ParisBranch branch = new ParisBranch(nameOfNewBranch);
            this.branches.add(branch);
            return true;
        }
        return false;
    }
    public boolean addCustomer(String nameOfExistingBranch,String nameCustomer,double initialTransaction){
        ParisBranch existingBranch = findBranch(nameOfExistingBranch);
        if(existingBranch != null)
            return existingBranch.newCustomer(nameCustomer, initialTransaction);
        return false;
    }
    public boolean addCustomerTransaction(String nameOfBranch,String nameCustomer,double initialTransaction){
        ParisBranch branch = findBranch(nameOfBranch);
        if(branch != null){
            return branch.addCustomerTransaction(nameCustomer, initialTransaction);
        }
        return false;
    }
    private ParisBranch findBranch(String nameOfBranch){
        for (ParisBranch branch : this.branches) {
            if (branch.getName().equals(nameOfBranch)) {
                return branch;
            }
        }
        return null;
    }
    @Override
    public boolean listCustomers(String nameOfBranch, boolean printTransaction){
        ParisBranch branch = findBranch(nameOfBranch);
        if(branch != null){
            System.out.println("Customer details for branch "+ nameOfBranch);
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i < branchCustomers.size();i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println("Customer: " +customer.getName() + "["+(i+1)+"]");
                if (printTransaction) {
                    System.out.println("Transactions");
                    for (int j = 0; j < customer.getTransactions().size(); j++) {
                        System.out.println("[" + (j + 1) + "]" + "  Amount " + customer.getTransactions().get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
