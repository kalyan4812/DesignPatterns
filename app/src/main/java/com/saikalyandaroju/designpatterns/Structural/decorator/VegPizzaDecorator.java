package com.saikalyandaroju.designpatterns.Structural.decorator;

public class VegPizzaDecorator extends PizzaDecorator{
    public VegPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return super.makePizza()+addCheese();
    }

    private String addCheese() {
        return "Added Cheese";
    }
}
