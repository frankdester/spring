package com.spring.bank;

import java.util.ArrayList;

public class InitialBank {
    private String name;
    private ArrayList<ParisBranch> ParisBranches;//group de ParisBranches

    public InitialBank(String name){ //to initialise our bank's name, permission to create our bank/ a new bank
        this.name = name;
        this.ParisBranches = new ArrayList<ParisBranch>(); // to instantiate (new ParisBranch)
    }

    public boolean addParisBranch(String nameOfNewParisBranch){ // add ParisBranches to your banks
        if(findParisBranch(nameOfNewParisBranch) == null){
            ParisBranch ParisBranch = new ParisBranch(nameOfNewParisBranch);
            this.ParisBranches.add(ParisBranch);
            return true;
        }
        return false;
    }
    public boolean addCustomer(String nameOfExistingParisBranch,String nameCustomer,double initialTransaction){
        ParisBranch existingParisBranch = findParisBranch(nameOfExistingParisBranch);
        if(existingParisBranch != null)
            return existingParisBranch.newCustomer(nameCustomer, initialTransaction);
        return false;
    }
    public boolean addCustomerTransaction(String nameOfParisBranch,String nameCustomer,double initialTransaction){
        ParisBranch ParisBranch = findParisBranch(nameOfParisBranch);
        if(ParisBranch != null){
            return ParisBranch.addCustomerTransaction(nameCustomer, initialTransaction);
        }
        return false;
    }
    private ParisBranch findParisBranch(String nameOfParisBranch){
        for(int i = 0;i<this.ParisBranches.size();i++){
            if(this.ParisBranches.get(i).getName().equals(nameOfParisBranch)){
                return this.ParisBranches.get(i);
            }
        }
        return null;
    }
    public boolean listCustomers(String nameOfParisBranch, boolean printTransaction){
        ParisBranch ParisBranch = findParisBranch(nameOfParisBranch);
        if(ParisBranch != null){
            System.out.println("Customer details for ParisBranch "+ nameOfParisBranch);
            ArrayList<Customer> ParisBranchCustomers = ParisBranch.getCustomers();
            for(int i = 0; i < ParisBranchCustomers.size();i++) {
                Customer customer = ParisBranchCustomers.get(i);
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
