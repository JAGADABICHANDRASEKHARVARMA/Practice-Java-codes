package com.company;

interface Writer{
    void write();
}

class pen implements Writer{

    public void write() {
        System.out.println("I am pen");
    }
}
class pencil implements Writer{

    public void write() {
        System.out.println("I am pencil");
    }
}
class kit{
    public void doSomething(Writer p){
        p.write();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        kit k = new kit();
        pen p = new pen();

        pencil pc = new pencil();

        k.doSomething(p);

    }
}
