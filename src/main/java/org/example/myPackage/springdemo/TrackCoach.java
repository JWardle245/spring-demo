package org.example.myPackage.springdemo;

import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Do a 7k run";
    }
}
