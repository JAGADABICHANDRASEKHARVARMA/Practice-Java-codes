package com.chandu;

import java.util.Arrays;

class split{
    private int[][] NewArray;

    public void split1(int[] arr ){
        int i =0;
        int subArray = arr.length;
        int counter =0;
        for ( i = 0; i < arr.length; i++){
            if(i % 5 == 0 &&  i != 0){
                NewArray[counter] = Arrays.copyOfRange(arr, i - 5 ,i);
                subArray -= 5;
                ++counter;
            }
        }
        NewArray [counter] = Arrays.copyOfRange(arr, i - subArray , i);
}

public static class Er {
    public static void main(String[] args) {
        split obj1 = new split();
    }
}}
