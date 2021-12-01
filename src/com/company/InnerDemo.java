package com.company;

class OuterClass
{
    int x = 10;

    class InnerClass
    {
        public int MyInner(){
            return x;

        }
    }
}

public class InnerDemo
{
    public static void main(String[] args)
    {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner);
    }
}
