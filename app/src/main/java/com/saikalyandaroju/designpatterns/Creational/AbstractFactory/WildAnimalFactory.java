package com.saikalyandaroju.designpatterns.Creational.AbstractFactory;

public class WildAnimalFactory extends AnimalFactory{
    @Override
    public Animal getAnimal(String animal) {
        switch (animal){
            case "Lion":
                return new Lion();
            case "Lepoard":
                return new Lepoard();
            default:
                break;
        }
        return null;
    }
}
