package com.company;

class Student{
    private int rollno;
    private String name;

    public int getRollno(){
        return rollno;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student O = new Student();
        O.setRollno(3);
        O.setName("Chandu");

        System.out.println(O.getRollno());
        System.out.println(O.getName());

    }
}
