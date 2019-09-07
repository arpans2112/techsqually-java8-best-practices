package com.techsqually.java8Topics.object;

public class ObjectComparisionTest {

    public int a;
    public int b;
    
    /*
     *  Tells if two objects of a class are equal or Note
     *
     * NOTE:
     * 1. Global Non static variable can't be access from a static method
     * 2. Static Variable can be used from static method as well as non static method
     * 3. if a variable is static, then it share the same value across all the objects created of that class.
     * 4. if the variable is instance variable then it share the different value across the all the objects created
     *
     * */

    ObjectComparisionTest(int a, int b) {

        this.a = a;
        this.b = b;

    }

    public static void main(String[] args) {

        ObjectComparisionTest obj1 = new ObjectComparisionTest(2, 3);
        ObjectComparisionTest obj2 = new ObjectComparisionTest(2, 3);
        ObjectComparisionTest obj3 = new ObjectComparisionTest(3, 4);

        System.out.println("Obj1 variables : " + obj1.a + " , " + obj1.b);
        System.out.println("obj2 variables : " + obj2.a + " , " + obj2.b);
        System.out.println("obj3 variables : " + obj3.a + " , " + obj3.b);

        System.out.println("obj1 and obj2 comparision : " + obj1.equalTo(obj2));
        System.out.println("obj1 and obj3 comparision : " + obj1.equalTo(obj3));

    }

    public boolean equalTo(ObjectComparisionTest object) {

        return object.a == a && object.b == b;

    }


}
