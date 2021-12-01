package com.company;

public class UdemyLogic {
    public static void main(String[] args) {
      /*  int marks = 45;
        if (marks <60){
            System.out.println("Fail");
        }
        if (marks >=60 && marks<90){
            System.out.println("Pass");
        }
        if (marks>=90 ){
            System.out.println("Passed with Distinction");
        }  */
       /*
        int num = 4;

        switch (num % 2)
        {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
                break;
        }  */
       /*  int num = 4;

        String res = (num %2==0)? "Even ":"Odd";
        System.out.println(res);  */

        int marks = 45;


        String result = (marks >= 90) ? "Passed with Distinction"
                : (marks >= 60) ? "Passed"
                : "Failed";
    }

}
