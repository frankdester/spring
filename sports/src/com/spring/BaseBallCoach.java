package com.spring;

import org.springframework.beans.factory.DisposableBean;

public class BaseBallCoach implements Coach, DisposableBean {
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
    @Override
    public void destroy() throws Exception {
        System.out.println("destroyer!!!");
    }
}
