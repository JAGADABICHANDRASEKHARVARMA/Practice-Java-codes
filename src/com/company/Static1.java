package com.company;

class Emp2{
    int eid;
    int salary;
    static String ceo;

    static {
        ceo = "chant";

    }
    public Emp2(){
        eid = 2;
        salary = 2000;
    }
    public void show(){
        System.out.println(eid + ":" + salary+":" + ceo);
    }

}

public class Static1 {
    public static void main(String[] args){
        Emp2 navin = new Emp2();
        Emp2 hema = new Emp2();

        hema.salary=10;
        navin.show();
        hema.show();
    }




}
