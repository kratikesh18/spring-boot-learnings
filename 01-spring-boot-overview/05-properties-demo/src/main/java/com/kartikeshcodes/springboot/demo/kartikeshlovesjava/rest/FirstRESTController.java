package com.kartikeshcodes.springboot.demo.kartikeshlovesjava.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRESTController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello blah blah blah from SpringBoot";
    }
    @GetMapping("/api/hello")
    public String sayHelloPage(){
        return "this is the page from spring";
    }
    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/another")
    public String saySomething(){
        return "<h1>Hello " + coachName +"</h1>";
    }

    @GetMapping("/test")
    public String checkDevtoolsWorking(){
        return "Yes devtools and Live reloading is working, Hello kartikesh";
    }
}
