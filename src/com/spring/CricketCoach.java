package com.spring;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach(){

    }
    //creating a setter in my class for injection
    public void setFortuneService(FortuneService fortuneService) {
        //setting injection in cricketCoach
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyFortune() {
        //dependency injection
        return this.fortuneService.getFortune();
    }
    @Override
    public String getDailyWorkout(){
        return "practice fast bowling";
    }
}
