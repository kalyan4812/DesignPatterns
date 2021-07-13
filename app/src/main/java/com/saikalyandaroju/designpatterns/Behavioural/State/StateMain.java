package com.saikalyandaroju.designpatterns.Behavioural.State;

public class StateMain {
    public static void main(String[] args) {
        TvContext tvContext=new TvContext();
        tvContext.setTv(new TvONState());

        tvContext.doTurnOnOrOffTv();


        tvContext.setTv(new TvOffState());
        tvContext.doTurnOnOrOffTv();
    }
}
