package com.techsqually.java.language.finalConcepts;

public class FinalVariablesTest {

    /*
     * Two ways of initializing the final variables
     * */

    public final int FILE_NEW = 1;
    public final int FILE_OPEN = 2;
    public final int FILE_SAVE = 3;
    public final int FILE_QUIT = 4;
    public final int VALUE_ASSIGN_IN_CONSTRUCTOR;


    FinalVariablesTest(int assigningValueToFinalVariableAtRunTime) {
        VALUE_ASSIGN_IN_CONSTRUCTOR = assigningValueToFinalVariableAtRunTime;
    }

}
