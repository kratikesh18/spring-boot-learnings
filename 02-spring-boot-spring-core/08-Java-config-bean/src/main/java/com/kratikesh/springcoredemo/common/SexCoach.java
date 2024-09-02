package com.kratikesh.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SexCoach implements Coach{
    public SexCoach(){
        System.out.println("In " + getClass().getSimpleName() );
    }



    @Override
    public String getDailyWorkout(){
        return "Lick pussy for half of day";
    }
}
