package com.kratikesh.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In " + getClass().getSimpleName() );
    }

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes!! :/ ";
    }
}
