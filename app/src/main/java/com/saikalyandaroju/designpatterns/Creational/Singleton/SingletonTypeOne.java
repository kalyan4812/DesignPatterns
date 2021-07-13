package com.saikalyandaroju.designpatterns.Creational.Singleton;


import androidx.annotation.NonNull;

//Eager Intialisation.
public class SingletonTypeOne {
    private static final SingletonTypeOne singletonTypeOne = new SingletonTypeOne();

    //private constructor so that no one can create object from outside.
    private SingletonTypeOne() {

    }

    public static SingletonTypeOne provideInstance() {
        return singletonTypeOne;
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonTypeOne;
    }
}
