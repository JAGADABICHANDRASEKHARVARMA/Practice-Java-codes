package com.company;
/*
import java.util.Scanner;

class names{
    String firstName;
    String lastName;



    public String firstName() {
        return("Chandu");
    }
    public String lastName() {
        return ("Varma");
    }
}

public class GettingUserInput {
    public static void main(String[] args){

        // firstName = "David";
        // lastName = "Williams";
        Scanner obj = new Scanner(System.in);
        obj.nextLine();


       obj.nextLine();
       obj.nextLine();
        String firstName = "";
        String lastName = "";
        System.out.println("My name is " + obj.nextLine()+" "+ obj.nextLine());
    }
}
*/

import java.util.Scanner;

public class GettingUserInput
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();


        System.out.println("The name is " + firstName + " "+ lastName);

    }
}