package com.kratikesh.springcoredemo.common;

public class RunCoach implements Coach{
    public RunCoach(){
        System.out.println("In constructor of " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Run 1000 meters as a warm-up";
    }
}
