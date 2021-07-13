package com.saikalyandaroju.designpatterns.Behavioural.Stratergy;

public class Car  implements TransportTypeStrategy{
    @Override
    public String travelMode() {
        return "ROAD";
    }
}
