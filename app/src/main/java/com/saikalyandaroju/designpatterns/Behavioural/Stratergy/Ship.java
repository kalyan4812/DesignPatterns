package com.saikalyandaroju.designpatterns.Behavioural.Stratergy;

public class Ship implements TransportTypeStrategy{
    @Override
    public String travelMode() {
        return "Water";
    }
}
