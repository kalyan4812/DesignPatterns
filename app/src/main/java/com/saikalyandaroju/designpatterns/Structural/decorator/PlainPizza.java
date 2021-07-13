package com.saikalyandaroju.designpatterns.Structural.decorator;

public class PlainPizza  implements Pizza{
    @Override
    public String makePizza() {
        return "PlainPizza";
    }
}
