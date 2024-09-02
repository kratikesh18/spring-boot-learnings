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

    //this is for the constructor injection

//    @Autowired
//    public DemoController(@Qualifier("sexCoach") Coach theCoach){
//        myCoach = theCoach;
//    }

//    after primary using no need of qualifier we setted primary coach to someone
@Autowired
public DemoController( Coach theCoach){
    myCoach = theCoach;
}

//    this is for the setter injection
//    @Autowired
//    public void whateverItIS(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
