package com.saikalyandaroju.designpatterns.Creational.Singleton;


import androidx.annotation.NonNull;

//Synchronized block.
public class SingletonTypeFour {
    private static SingletonTypeFour singletonTypeFour;

    //private constructor so that no one can create object from outside.
    private SingletonTypeFour() {
        System.out.println("singleton class instance created");
    }

    public static SingletonTypeFour provideInstance() {
        if (singletonTypeFour == null) {
            synchronized (SingletonTypeFour.class) {
                if (singletonTypeFour == null) {
                    singletonTypeFour = new SingletonTypeFour();
                }
            }
        }

        return singletonTypeFour;
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonTypeFour;
    }

   /* Note this ,if we have inner classes,if we access them from outside our private construcotr will be called again
   so indirectly we are creating two instances for singleton ,so thats why we should make a singleton class final.

   public static class  InnerClass extends SingletonTypeFour{

    }
    */


}
/*
private constructor restricts inheritance from outside.
final keyowrd pervents inheritance from inner classes.
 */
