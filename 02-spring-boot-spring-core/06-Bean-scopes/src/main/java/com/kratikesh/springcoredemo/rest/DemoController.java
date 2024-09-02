package com.kratikesh.springcoredemo.rest;

import com.kratikesh.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //defining private field for dependency
    private Coach myCoach;
    private Coach anotherCoach;


    //this is for the constructor injection
    @Autowired
    public DemoController(
            @Qualifier("sexCoach") Coach theCoach,
            @Qualifier("sexCoach") Coach theAnotherCoach
    ){
        System.out.println("In " + getClass().getSimpleName() );
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans : myCoach == anotherCoach : " + (myCoach == anotherCoach);
    }
}
