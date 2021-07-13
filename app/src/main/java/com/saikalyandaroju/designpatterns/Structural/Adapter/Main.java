package com.saikalyandaroju.designpatterns.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        // work.writeAnswer("Helllooo....");  --> gives null pointer exception because we dont have implemnetation for pen.
        Pen pen = new PenAdapter();
        work.setPen(pen);
        work.writeAnswer("Hellooooo..........");
    }
}
