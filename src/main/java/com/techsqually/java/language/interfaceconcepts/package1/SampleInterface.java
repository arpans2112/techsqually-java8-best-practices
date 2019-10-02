package com.techsqually.java.language.interfaceconcepts.package1;

public interface SampleInterface {

    /*
     * 1. Must bahave public static final variable types only , must be initialize
     * 2. So No need to of constructor to initalize the variables
     * 3. access modifier must be public for the interfaces, so that can be access outside the package
     * 4. Variable declared in Interface are BY DEFAULT  (public  static final) , they can't be changed
     * 5. members(variable/methods) are default public in interface, you don't need to explicitly define them
     * 6. due to point 5, interface method can be access accross different packages too
     * 7. A Class can extend only one class but can implement nultiple interfaces
     * */


    int FILE_OPEN = 0;
    int FILE_CLOSE = 1;
    int FILE_QUITE = 2;

    void imInSampleInterface();

    int getFileOpenStatus();


}
