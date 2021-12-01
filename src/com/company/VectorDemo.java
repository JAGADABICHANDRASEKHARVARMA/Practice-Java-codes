package com.company;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) throws Exception {

        Vector<Integer> v = new Vector<>();
        v.add(19);
        v.add(9);
        v.add(19);
        v.add(9);
        v.add(19);
        v.add(9);
        v.add(19);
        v.add(9);
        v.add(19);
        v.add(9);
        v.add(19);
        v.add(9);
        v.add(19);
        v.add(9);
        v.add(19);
        v.add(9);

        System.out.println(v.capacity());

        for(int i : v){
            System.out.println(i);
        }

    }
}
