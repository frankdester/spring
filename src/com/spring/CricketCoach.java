package com.spring;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    //value injection
    private String email;
    private String team;

    public CricketCoach(){

    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam() {
        return this.team;
    }
    public String getEmail() {
        return this.email;
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
