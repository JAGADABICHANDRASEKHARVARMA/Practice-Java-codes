package com.company;

import java.util.Scanner;

public class InputMismatchException {
    public static void main (String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println( " ");
        int numerator = inputDevice.nextInt();

        new InputMismatchException().doDivide(numerator);
        int numerator1 = inputDevice.nextInt();

    }
    public void doDivide(int a){
        int result = a;
        System.out.println(result);
    }

}
