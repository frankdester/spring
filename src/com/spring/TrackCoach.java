package com.spring;

public class TrackCoach implements Coach {

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getDailyWorkout(){
        return "you should run for 5K";
    }
}
