package com.techsqually.java.language.generics.basics.example1typeclassinvocation;


/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
        // T stands for "Type"
        private T t;

        public void set(T t) { this.t = t; }
        public T get() { return t; }

}
