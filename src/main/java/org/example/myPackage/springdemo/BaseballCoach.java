package org.example.myPackage.springdemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Spend 60 minutes on batting practice";
    }
}
