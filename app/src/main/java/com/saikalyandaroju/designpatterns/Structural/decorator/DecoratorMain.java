package com.saikalyandaroju.designpatterns.Structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        PlainPizza plainPizza=new PlainPizza();
        System.out.println(plainPizza.makePizza());

        ChickenPizzaDecorator chickenPizzaDecorator=new ChickenPizzaDecorator(plainPizza);
        System.out.println(chickenPizzaDecorator.makePizza());

        VegPizzaDecorator vegPizzaDecorator=new VegPizzaDecorator(plainPizza);
        System.out.println(vegPizzaDecorator.makePizza());
    }
}
