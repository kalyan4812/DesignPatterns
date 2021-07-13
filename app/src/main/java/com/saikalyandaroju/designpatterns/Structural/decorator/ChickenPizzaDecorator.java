package com.saikalyandaroju.designpatterns.Structural.decorator;

public class ChickenPizzaDecorator extends PizzaDecorator{


    public ChickenPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return super.makePizza()+addChicken();
    }

    private String addChicken() {
        return "Added Chicken";
    }
}
