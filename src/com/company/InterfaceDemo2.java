package com.company;

interface abc{
    void show();
}

class implimentor implements abc{
    public void show() {
        System.out.println("Anything in show");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        abc obj = new implimentor();

        obj.show();

    }
}
