package com.saikalyandaroju.designpatterns.Creational.AbstractFactory;

public abstract class AnimalFactory {
   public abstract Animal getAnimal(String animal);

   public static AnimalFactory getAnimalFactory(AnimalType animalType){
       switch (animalType){
           case WILD:
               return new WildAnimalFactory();
           case DOMESTIC:
               return new DomesticAnimalFactory();
           default:
               return new WildAnimalFactory();
       }
   }
}
