package com.spring;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
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
    public void openMethod(){
        System.out.println("Merhaba");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("destroyer!!!");
    }
}
