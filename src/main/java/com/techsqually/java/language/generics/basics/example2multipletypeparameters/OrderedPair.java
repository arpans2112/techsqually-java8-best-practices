package com.techsqually.java.language.generics.basics.example2multipletypeparameters;



public class OrderedPair<K,V> implements Pairs<K,V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value){
        this.key = key;
        this.value = value;
    }


    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
