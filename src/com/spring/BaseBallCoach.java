package com.spring;

public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "you should play batting for 30 minnutes";
    }
}
