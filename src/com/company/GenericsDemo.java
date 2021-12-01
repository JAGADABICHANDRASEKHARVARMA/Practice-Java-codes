package com.company;

import java.util.*;

public class GenericsDemo {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<Integer>();

        obj.add(10);
        obj.add(20);
        obj.add(99);

        obj.add(2,1);
        Collections.sort(obj);
        obj.forEach(System.out::println);  // stream API

//       Iterator i =  obj.iterator();

//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

//        for(int j : obj){
//            System.out.println(j);
//        }
//
    }
}
