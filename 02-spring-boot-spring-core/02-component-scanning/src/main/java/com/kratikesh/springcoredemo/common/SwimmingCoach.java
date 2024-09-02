package com.kratikesh.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Do bubbling and floating for 10 minutes daily";
    }
}
