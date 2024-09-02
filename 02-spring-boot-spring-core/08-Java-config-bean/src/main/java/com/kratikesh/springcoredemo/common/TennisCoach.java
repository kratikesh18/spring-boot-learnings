package com.kratikesh.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("In " + getClass().getSimpleName() );
    }
    @Override
    public String getDailyWorkout(){
        return "sleep for whole day";
    }
}
