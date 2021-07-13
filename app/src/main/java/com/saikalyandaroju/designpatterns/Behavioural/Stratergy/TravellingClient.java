package com.saikalyandaroju.designpatterns.Behavioural.Stratergy;

public class TravellingClient {
    private TransportTypeStrategy transportTypeStrategy;

    public TravellingClient(TransportTypeStrategy transportTypeStrategy) {
        this.transportTypeStrategy = transportTypeStrategy;
    }
    public void update(TransportTypeStrategy transportTypeStrategy){
      this.transportTypeStrategy=transportTypeStrategy;
    }

    public void howToTravel(){
        System.out.println("Travel By "+transportTypeStrategy.travelMode());
    }
}
