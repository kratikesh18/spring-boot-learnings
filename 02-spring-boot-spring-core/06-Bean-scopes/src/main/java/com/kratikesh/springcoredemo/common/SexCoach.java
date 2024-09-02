package com.kratikesh.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SexCoach implements Coach{
    public SexCoach(){
        System.out.println("In " + getClass().getSimpleName() );
    }
    @Override
    public String getDailyWorkout(){
        return "Lick pussy for half of day";
    }
}
