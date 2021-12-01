package com.company;

interface ab{
    void abc();
    default void show(){
        System.out.println("in Show");
    }
}
class abImp implements ab{
    public void abc() {
        System.out.println("hello world");
    }
    public void show() {
        System.out.println("in new show");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        ab obj = new abImp();
        obj.abc();
        obj.show();

    }
}
