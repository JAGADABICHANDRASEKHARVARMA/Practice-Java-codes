package com.company;

class Ab{
    public void show(){
        System.out.println("I am chandu");
    }
}

public class AnonymousDemo {
    public static void main(String[] args) {
        Ab obj = new Ab()
        {

            public void show() {
                System.out.println("I am chandu and practicing java");
            }
        };
        obj.show();
    }
}
