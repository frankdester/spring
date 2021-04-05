package com.spring;

public class HappyFortuneServices implements FortuneService{

    @Override
    public String getFortune(){
        return ("Today is a good day");
    }
}
