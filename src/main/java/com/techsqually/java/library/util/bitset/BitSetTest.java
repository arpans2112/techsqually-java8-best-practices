package com.techsqually.java.library.util.bitset;

import java.util.BitSet;

public class BitSetTest {


    public static void main(String[] args) {

        BitSet a = new BitSet(3);
        a.set(0,3);

        /** Returns the number of bits set to true*/
        System.out.println(a.cardinality());

        BitSet b = new BitSet(3);

        System.out.println(b.cardinality());

    }

}
