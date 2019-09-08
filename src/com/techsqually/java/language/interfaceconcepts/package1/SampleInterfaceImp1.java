package com.techsqually.java.language.interfaceconcepts.package1;

public class SampleInterfaceImp1 extends SampleInterfaceImp implements SampleInterface, SampleInterface1 {


    /*
     * NOte method defined in Interface are by default public, that's why are able to access the method in different package
     * */
    @Override
    public void imInSampleInterface() {

    }

    @Override
    public int getFileOpenStatus() {
        return 0;
    }
}
