package com.spring;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(){

    }
    //creating a constructor in my class for injection
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout(){
        return "you should run for 5K";
    }
}
