package com.company;

class Emp1{
    int eid;
    int salary;
    static String ceo;

    public void show(){
        System.out.println(eid+":" + salary+":"+ ceo);
    }

}

public class Static {
    public static void main(String[] args){
        Emp1 navin = new Emp1();
        navin.eid=9;
        navin.salary=1000;

        Emp1 chandu2 = new Emp1();
        chandu2.eid= 10;
        chandu2.salary = 2000;
        
        navin.ceo= "chain";

        chandu2.show();
        navin.show();

    }
}
