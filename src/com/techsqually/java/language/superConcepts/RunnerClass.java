package com.techsqually.java.language.superConcepts;

import java.lang.reflect.Field;

public class RunnerClass {

    /*
    *  1. you can access the public variables but not private variables
       2. you can access the public member of any class by assigning the subclass object in superclass Object,
          special used when same member name is used across multiple superclasses in the hirarchy, if
          different names are used, then you can access everything by object of mostSub class.
       3. if same member name(variable/Method) name is used in subclass and super Class, then super.memberName
           is used to access the super class members
    *  4. Please execute the below method to see the hirarhy of execution of the constructors of all subclass and superclass if you forget
    *
    * */

    public static void main(String[] args) {

        SubClassBofSubClassAofBaseClass subClassBofSubClassAofBaseClass
                = new SubClassBofSubClassAofBaseClass(1, 2, 3, 4, 5);

        SubClassAofBaseClass subClassAofBaseClass = subClassBofSubClassAofBaseClass;

        System.out.println(subClassBofSubClassAofBaseClass.j);
        System.out.println(subClassAofBaseClass.l);
        System.out.println(subClassBofSubClassAofBaseClass.l);
        System.out.println(subClassBofSubClassAofBaseClass.getClass().getSuperclass().getFields());


        //Access Any fields of SuperClass
        for (Field i : subClassBofSubClassAofBaseClass.getClass().getSuperclass().getFields()) {
            System.out.println(i);
        }


    }
}
