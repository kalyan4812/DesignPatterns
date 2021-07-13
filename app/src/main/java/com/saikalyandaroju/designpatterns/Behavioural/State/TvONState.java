package com.saikalyandaroju.designpatterns.Behavioural.State;

public class TvONState implements Tv{
    @Override
    public void doTurnOnOrOffTv() {
        System.out.println("TV is turned on");
    }
}
