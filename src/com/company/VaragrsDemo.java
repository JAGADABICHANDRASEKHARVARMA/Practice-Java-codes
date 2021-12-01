package com.company;
class cal{
    public int add(int ... n){
        int sum = 0;
        for (int i :n){
            sum = sum + i;
        }
        return sum;
    }
}

public class VaragrsDemo {
    public static void main(String[] args) {
        cal obj = new cal();
        System.out.println(obj.add(2,3,4,5,6,234,23,23,233,45,356,245));

    }
}
