package com.company;

interface Zero{
    void abc();
    default void show(){
        System.out.println("In Zero");
    }
}
interface MyZero{
    default void show(){
        System.out.println("In MyZero");
    }

}
class ImpZero implements Zero, MyZero{

    public void abc() {
        System.out.println("in abc");
    }

    @Override
    public void show() {
        MyZero.super.show();
    }
}

public class IssueWithMultipleInheritanceInInterface {
    public static void main(String[] args) {
        Zero obj = new ImpZero();

        obj.abc();
        obj.show();

    }
}
