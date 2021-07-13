package com.saikalyandaroju.designpatterns.Structural.Adapter.JavaExample;

import java.util.ArrayList;

public class MyAdapter {
    String s[];

    public MyAdapter(String[] s) {
        this.s = s;
    }

    public ArrayList<String> covertArrayToArrayList(){
        ArrayList<String> al=new ArrayList<>();
        for(String str:s){
            al.add(str);
        }
        return al;
    }
}
