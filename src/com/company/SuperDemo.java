package com.company;

class A1{
    public A1(){
        System.out.println("in A1");
    }
    public A1(int i)
    {
        System.out.println("in A1 int");
    }
}
class B1 extends A1{
    public B1(){
        super(8);
        System.out.println("in B1");
    }
    public B1(int i)
    {
        super();
        System.out.println("in B1 int");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B1 obj = new B1(8);

    }
}
