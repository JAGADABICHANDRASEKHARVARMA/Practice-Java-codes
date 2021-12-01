package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(987);
        values.add(181);
        values.add(872);
        values.add(568);
        values.add(123);


//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1%10>o2%10)
//                return 1;
//             return -1;
//            }
//        };

//        Collections.sort(values,com );

          Collections.sort(values ,(o1,o2) -> {
              return o1%10>o2%10 ? 1 : -1;
          }
    );

        for(int i :values){
            System.out.println(i);
        }

    }
}
