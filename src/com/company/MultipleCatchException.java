package com.company;


public class MultipleCatchException {
    public static void main(String[] args) {
        try{
            int a[] = null;
            a[3] = 6;
            int i = 8;
            int j = 2;
            int k = i/j;
            System.out.println("Output is "+k);

        }
        catch (ArithmeticException e)
        {
            System.err.println("Cannot divide with zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit..");
        }
        catch (Exception e){
            System.out.println("Something wrong...");
        }
        finally {
            System.out.println("Bye");
        }
    }
}

