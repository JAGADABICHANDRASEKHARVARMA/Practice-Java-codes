package com.company;

class printer
{
    public void show(Number i)
    {
        System.out.println(i);
    }
}

public class AbstractDemo2
{
    public static void main(String[] args)
    {
        printer obj = new printer();
        obj.show(29);
        obj.show(88.0d);

    }
}
