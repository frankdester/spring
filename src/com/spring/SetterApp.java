package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {
    public static void main(String[] args) {
        //load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        //call the method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method for fortune
        System.out.println(theCoach.getDailyFortune());

        //call get methods
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        //close context
        context.close();
    }
}
