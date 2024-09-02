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


    @Autowired
    public DemoController( @Qualifier("sexCoach") Coach theCoach ){
        System.out.println("In " + getClass().getSimpleName() );
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


}
