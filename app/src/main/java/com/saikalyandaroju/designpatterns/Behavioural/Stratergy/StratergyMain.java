package com.saikalyandaroju.designpatterns.Behavioural.Stratergy;

public class StratergyMain {
    public static void main(String[] args) {
        TravellingClient travellingClient=new TravellingClient(new Car());
        travellingClient.howToTravel();

        // Change the Strategy to Airplane.
        travellingClient.update(new Airplane());
        travellingClient.howToTravel();
    }
}
