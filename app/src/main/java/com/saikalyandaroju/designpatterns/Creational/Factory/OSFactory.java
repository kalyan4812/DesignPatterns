package com.saikalyandaroju.designpatterns.Creational.Factory;

public class OSFactory {

    public OS getInstance(OsType osType) {
        switch (osType) {
            case OPEN_SOURCE:
                return new Android();
            case CLOSED_SOURCE:
                return new Apple();
            default:
                return new Android();
        }
    }
}
/*
The factory pattern design pattern handles these problems by defining a separate
method for creating the objects, these methods optionally accept parameters defining how the
object is created, and then return the created object.

In our case param is enum.
 */
