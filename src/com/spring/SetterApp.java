package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {
    public static void main(String[] args) {
        //load spring configuration file
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = con.getBean("myCricketCoach",Coach.class);

        //call the method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method for fortune
        System.out.println(theCoach.getDailyFortune());

        //close context
        con.close();
    }
}
