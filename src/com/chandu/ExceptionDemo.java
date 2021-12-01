package com.chandu;

public class ExceptionDemo {
    public static void main(String[] args) {

        try{
            int i = 8;
            int j = 0;
            int k = i/j;
            System.out.println("Output is "+k);

        }
        catch (ArithmeticException e)
        {
            System.err.println("Error");
        }
        finally {
            System.out.println("Bye");
        }
    }
}
