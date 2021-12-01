    package com.company;

    public class EnhancedForInArrays {
        public static void main(String[] args)
        {
            int a[] = {1,2,3,4};
            int b[] = {4,5,6};
            int c[] = {7,8,9,9,0};

            int d[][] =
                    {
                            {1,2,3,4},
                            {4,5,6},
                            {7,8,9,9, 0}
                    };

            for (int k[] : d)
            {
                for (int l : k)
                {
                    System.out.print(" "+l);
                }
                System.out.println();
            }
        }
    }
