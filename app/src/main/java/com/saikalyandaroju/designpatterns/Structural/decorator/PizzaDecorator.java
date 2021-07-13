package com.saikalyandaroju.designpatterns.Structural.decorator;

public abstract class PizzaDecorator implements Pizza {

    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza();
    }
}
