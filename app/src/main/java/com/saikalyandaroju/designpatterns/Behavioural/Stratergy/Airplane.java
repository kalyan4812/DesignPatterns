package com.saikalyandaroju.designpatterns.Behavioural.Stratergy;

public class Airplane implements TransportTypeStrategy{
    @Override
    public String travelMode() {
        return "AIR";
    }
}
