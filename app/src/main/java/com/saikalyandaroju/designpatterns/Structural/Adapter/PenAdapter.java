package com.saikalyandaroju.designpatterns.Structural.Adapter;

public class PenAdapter implements Pen {
    SkeletonPen skeletonPen=new SkeletonPen();
    @Override
    public void write(String s) {
        skeletonPen.markTheText(s);
    }
}
