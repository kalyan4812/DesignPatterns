package com.saikalyandaroju.designpatterns.Creational.AbstractFactory;

public class DomesticAnimalFactory extends AnimalFactory {
    @Override
    public Animal getAnimal(String animal) {
        switch (animal){
            case "Dog":
                return new Dog();
            case "Cow":
                return new Cow();
            default:
                break;
        }
        return null;
    }
}
