package com.company;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int i = 5; //primitive datatype

        Integer ii = new Integer(5); // boxing - Wrapping

        int j = ii.intValue(); // unboxing - Unwrapping

        Integer value = i; // AutoBoxing - AutoWrapping

        int k = i; // AutoUnBoxing - AutoUnWrapping


        String str = "123";

        int n = Integer.parseInt(str);
        System.out.println(n);



    }
}
