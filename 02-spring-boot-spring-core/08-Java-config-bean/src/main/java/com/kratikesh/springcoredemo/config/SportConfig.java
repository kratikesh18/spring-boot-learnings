package com.kratikesh.springcoredemo.config;

import com.kratikesh.springcoredemo.common.Coach;
import com.kratikesh.springcoredemo.common.RunCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

//    @Bean
//    public Coach runCoach(){
//        return new RunCoach();
//    }

    @Bean("athelete")
    public Coach runCoach(){
        return new RunCoach();
    }
}
