package com.saikalyandaroju.designpatterns.Structural.Adapter;

public class Work {

    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void  writeAnswer(String s){
        pen.write(s);
    }

}
