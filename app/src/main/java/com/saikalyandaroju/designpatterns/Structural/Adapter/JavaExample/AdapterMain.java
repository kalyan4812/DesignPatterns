package com.saikalyandaroju.designpatterns.Structural.Adapter.JavaExample;

import java.util.ArrayList;

public class AdapterMain {
    public static void main(String[] args) {

        String s[]={"kalyan","android","data structures","java","design patterns","cs"};
        MyAdapter myAdapter=new MyAdapter(s);
        ArrayList<String> al=myAdapter.covertArrayToArrayList();

        System.out.println(al.toString());

    }

}
/*
covering a list to array also follows adapter pattern.
conversion of one collection to other is also a kind of adapter pattern.
 */
/*
 other case is when you want to reuse methods particular class/interface which are suitable for us.
 */
