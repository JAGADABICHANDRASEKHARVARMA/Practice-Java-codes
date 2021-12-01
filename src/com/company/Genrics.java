package com.company;

import java.util.*;

class Container<T extends Number>
{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public void show(){
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<? super Number> obj ){
        System.out.println("in the Demo");
    }
}

public class Genrics {
    public static void main(String[] args) {
        Container <Number> obj = new Container<>();
        obj.value=9;
        obj.show();
        obj.demo(new ArrayList<Number>());

    }
}
