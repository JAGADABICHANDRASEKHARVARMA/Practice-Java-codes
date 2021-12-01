package com.company;

class Calculator{
    public int add(int ... n){
        int sum = 0;
        for(int k : n){
            sum = sum + k;
        }
        return sum;
    }

}
class calAdv extends Calculator{
    public int sub(int ... n1){
        int subs = 0;
        for (int l : n1){
            subs = subs - l;
        }
        return subs;
    }
}
class calVeryAdv extends calAdv{
    public int mul(int ... n2){
        int multi = 1;
        for (int m : n2){
            multi = multi * m;
        }
        return multi;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        calVeryAdv c1 = new calVeryAdv();
        int result = c1.add(1,2,3,5,6,7,822,33,45,100);
        int result1 = c1.sub(2,3,4,2,100);
        int result2 = c1.mul(2,3,4,5);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
