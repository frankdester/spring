package com.spring;

public class BaseBallCoach implements Coach {
    private FortuneService fortuneService;

    //creating a constructor in my class for injection
    public BaseBallCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyFortune() {
        //dependency injection
        return this.fortuneService.getFortune();
    }
    @Override
    public String getDailyWorkout(){
        return "you should play batting for 30 minutes";
    }
    public void openMethod(){
        System.out.println("Merhaba");
    }
    public void closeMethod(){
        System.out.println("Gule Gule");
    }
}
