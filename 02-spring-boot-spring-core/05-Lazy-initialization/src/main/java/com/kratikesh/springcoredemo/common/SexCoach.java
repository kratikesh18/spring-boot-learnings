package com.kratikesh.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class SexCoach implements Coach{
    public SexCoach(){
        System.out.println("In " + getClass().getSimpleName() );
    }
    @Override
    public String getDailyWorkout(){
        return "Lick pussy for half of day";
    }
}
