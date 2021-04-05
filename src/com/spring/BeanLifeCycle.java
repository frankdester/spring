package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {
        //load spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        //call the method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close context
        context.close();


    }
}
