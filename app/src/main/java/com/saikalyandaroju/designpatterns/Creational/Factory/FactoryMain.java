package com.saikalyandaroju.designpatterns.Creational.Factory;

public class FactoryMain {

    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS p1 = osFactory.getInstance(OsType.OPEN_SOURCE);
        OS p2 = osFactory.getInstance(OsType.CLOSED_SOURCE);

        p1.name();
        p2.name();


    }
}
/*
 note if change the constructor of android ,apple class no effect here ,only i need to change in factory class.

 */

/*
A Simple Factory pattern returns an instance of one of several possible (sub) classes
depending on the data provided to it. Usually all classes that it returns have a common parent
class and common methods, but each performs a task differently and is optimized for different
kinds of data.
 */

/*
In programmer’s language, you can use factory pattern where you have to create an
object of any one of sub-classes depending on the data provided.
 */