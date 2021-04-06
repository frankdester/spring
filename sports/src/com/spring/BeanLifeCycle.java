package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {
        //load spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myBaseBallCoach",Coach.class);
        Coach theAlphaCoach = context.getBean("myBaseBallCoach",Coach.class);


        //call the method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //check result
        boolean result = (theCoach == theAlphaCoach);

        //print result to differentiate between singleton and prototype
        System.out.println("Is the theAlphaCoach and theCoach equal: "+result);
        System.out.println("theCoach is located at: "+theCoach);
        System.out.println("theAlphaCoach is located at: "+theAlphaCoach);

        //bean life cycle
        Coach myTrackCoach = context.getBean("myTrackCoach",Coach.class);
        System.out.println(myTrackCoach.getDailyWorkout());


        //close context
        context.close();
    }
}
