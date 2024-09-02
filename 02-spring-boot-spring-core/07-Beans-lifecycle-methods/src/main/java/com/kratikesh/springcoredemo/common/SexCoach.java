package com.kratikesh.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SexCoach implements Coach{
    public SexCoach(){
        System.out.println("In " + getClass().getSimpleName() );
    }


    //defining init method
    @PostConstruct
    public void doStuffAfterInitialization(){
        System.out.println("In Afterconstruction() " + getClass().getSimpleName());
    }

    //defining destroy method
    @PreDestroy
    public void doStuffBeforeDestroying(){
        System.out.println("In BeforeDestroying() "+ getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout(){
        return "Lick pussy for half of day";
    }
}
