package com.saikalyandaroju.designpatterns.Behavioural.State;

public class TvContext implements Tv{

    private Tv tv;

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void doTurnOnOrOffTv() {
         System.out.println("Current state :"+tv.getClass().getSimpleName());
         tv.doTurnOnOrOffTv();
    }
}
