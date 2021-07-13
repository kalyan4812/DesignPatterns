package com.saikalyandaroju.designpatterns.Structural.Composite;

public class Leaf implements Component{
    private String name;
    private long price;

    public Leaf(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name+" : "+price);
    }
}
