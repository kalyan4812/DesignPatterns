package com.saikalyandaroju.designpatterns.Creational.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        Phone phone=new Phone.Builder().setOS("Android").setColor("Black").setPrice(12000)
                .setRam(3).build();

        System.out.println(phone);
    }
}
/*
Use the Builder pattern when
 The creation algorithm of a complex object is independent from the parts that actually
compose the object.
  The system needs to allow different representations for the objects that are being built.
 */
