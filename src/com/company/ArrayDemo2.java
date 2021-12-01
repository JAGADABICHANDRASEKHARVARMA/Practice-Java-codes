package com.company;

public class ArrayDemo2 {
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4};
        int b[] = {4,5,6};
        int c[] = {7,8,9,0,9};

        int d[][] =
                {
                        {1,2,3,4},
                        {4,5,6},
                        {7,8,9,0,9}
                };


       /* for (int i = 0; i<3;i++)
        {
            for(int j = 0;j<4;j++){
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        } */

        for(int i = 0;i< d.length;i++)
        {
            for (int j = 0;j<d[i].length;j++)
            {
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        }
    }
}
