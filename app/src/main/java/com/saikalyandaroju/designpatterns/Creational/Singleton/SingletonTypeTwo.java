package com.saikalyandaroju.designpatterns.Creational.Singleton;


import androidx.annotation.NonNull;

//Lazy Intialisation.
public class SingletonTypeTwo {
    private static SingletonTypeTwo singletonTypeTwo;

    //private constructor so that no one can create object from outside.
    private SingletonTypeTwo() {

    }

    public static SingletonTypeTwo provideInstance() {
        if (singletonTypeTwo == null) {
            singletonTypeTwo = new SingletonTypeTwo();
        }

        return singletonTypeTwo;
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonTypeTwo;
    }
}
