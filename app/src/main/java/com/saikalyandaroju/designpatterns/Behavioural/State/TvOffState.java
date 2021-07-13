package com.saikalyandaroju.designpatterns.Behavioural.State;

public class TvOffState implements Tv{
    @Override
    public void doTurnOnOrOffTv() {
        System.out.println("Tv is turn off");
    }
}
