package com.company;

interface abx{
    void show();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        abx obj = () -> System.out.println("I am chandu");
        obj.show();

    }
}
