package com.kratikesh.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary      //more than @primary annotation will make trouble and crash the program
public class SwimmingCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Do bubbling and floating for 10 minutes";
    }
}
