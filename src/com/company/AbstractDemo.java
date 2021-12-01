package com.company;

abstract class Human{
    public abstract boolean eat();

    public void walk(){

    }
}
class Man extends Human{
    public boolean eat() {
        System.out.println("in Eat");
        return false;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Human obj = new Man();

        System.out.println(obj.eat());
    }
}
