package com.saikalyandaroju.designpatterns.Creational.Singleton;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SingletonMain {

    public static void main(String... args) throws CloneNotSupportedException {
        SingletonTypeFour d1 = SingletonTypeFour.provideInstance();
        System.out.println("Hashcode of d1 Object: " + d1.hashCode());
        System.out.println();


        SingletonTypeFour d2 = d1.provideInstance();
        System.out.println("Hashcode of d2 Object: " + d2.hashCode());
        System.out.println();


        SingletonTypeFour d3 = (SingletonTypeFour) d1.clone();
        System.out.println("Hashcode of d3 Object: " + d3.hashCode());

       /*
       Example showing how innner classes in singleton class which extends singleton class violate the singleton pattern,
       by creating a new instance of singleton class whenevr they are created.
        SingletonTypeFour.InnerClass d4=new SingletonTypeFour.InnerClass();
        System.out.println("Hashcode of d4 Object: "+d4.hashCode());

        */


        //all give same haashcode ,i.e we are using same object.

    }



}
