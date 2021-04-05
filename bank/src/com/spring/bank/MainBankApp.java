package com.spring.bank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBankApp {
    public static void main(String[] args) {

        //load information from spring container (configuration file)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bankFile.xml");

        //retrieve bean from spring container
        Bank parisHSBCBank = context.getBean("ParisHSBC Bank", Bank.class);
        Bank shanghaiHSBCBank = context.getBean("ShanghaiHSBC Bank", Bank.class);

        //call methods on bean


            //view available clients in ParisHSBC in each branch



        //close bean
        context.close();

//        ParisBank bank = new ParisBank("National Australia Bank");
//
//        bank.addBranch("Adelaide");
//        bank.addCustomer("Adelaide", "Tim", 50.05);
//        bank.addCustomer("Adelaide", "Mike", 175.34);
//        bank.addCustomer("Adelaide", "Percy", 220.12);
//
//        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
//        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
//        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
//        bank.addCustomerTransaction("Adelaide", "terry", 1.65);
//
//
//        bank.listCustomers("Adelaide", true);

    }
}
