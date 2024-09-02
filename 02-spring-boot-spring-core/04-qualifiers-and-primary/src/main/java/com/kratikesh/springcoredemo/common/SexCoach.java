package com.kratikesh.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SexCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Lick pussy for half of day";
    }
}
