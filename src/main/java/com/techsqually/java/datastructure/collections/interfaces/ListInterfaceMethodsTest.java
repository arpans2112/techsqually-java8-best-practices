package com.techsqually.java.datastructure.collections.interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListInterfaceMethodsTest {

    public static void main(String[] args) {

        /**
         * 1. Manintains insertion orders
         * 2. Can contain null values
         * 3. add will add the element in the last of the list
         * 4. implements collection interface
         *
         * */
        List<Integer> acb = new ArrayList<>();
        acb.add(1);
        acb.add(2);
        acb.add(3);
        acb.add(null);
        acb.set(2,4);
        System.out.println(acb);

        /** end index is execluded*/
        System.out.println(acb.subList(1,2));;






    }

}
