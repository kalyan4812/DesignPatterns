package com.saikalyandaroju.designpatterns.Creational.Singleton;


import androidx.annotation.NonNull;

//Synchronized method.
public class SingletonTypeThree {
    private static SingletonTypeThree singletonTypeThree;

    //private constructor so that no one can create object from outside.
    private SingletonTypeThree() {

    }

    public static  synchronized SingletonTypeThree provideInstance() {
        if (singletonTypeThree == null) {
            singletonTypeThree = new SingletonTypeThree();
        }

        return singletonTypeThree;
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonTypeThree;
    }
}
