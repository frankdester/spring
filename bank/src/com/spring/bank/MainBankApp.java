package com.spring.bank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBankApp {
    public static void main(String[] args) {

        //load information from spring container (configuration file)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bankFile.xml");

        //retrieve bean from spring container
        Bank parisHSBCBank = context.getBean("ParisHSBCBank", Bank.class);
        Bank shanghaiHSBCBank = context.getBean("ShanghaiHSBCBank", Bank.class);
        InitialBank newBank = new InitialBank("InitialBanque");


        //call methods on bean
            //view available clients in ParisHSBC in each branch
        System.out.println(parisHSBCBank.getName());

        newBank.addParisBranch("Adelaide");
        newBank.addCustomer("Adelaide", "Tim", 50.05);
        newBank.addCustomer("Adelaide", "Mike", 175.34);
        newBank.addCustomer("Adelaide", "Percy", 220.12);

        newBank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        newBank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        newBank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        newBank.addCustomerTransaction("Adelaide", "terry", 1.65);


        newBank.listCustomers("Adelaide", true);

        //close bean
        context.close();
    }
}
