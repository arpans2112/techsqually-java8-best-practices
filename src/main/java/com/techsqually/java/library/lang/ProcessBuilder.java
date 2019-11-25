package com.techsqually.java.library.lang;

import java.util.Map;

public class ProcessBuilder {

    /**
     * ProcessBuilder provides another way to start and manage processes
     *
     * Process Can be started by : Runtime.exec()
     *
     * Constructors
     * ProcessBuilder(List<String> args)
     * ProcessBuilder(String...args)
     * */

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        java.lang.ProcessBuilder processBuilder = new java.lang.ProcessBuilder();
        System.out.println(processBuilder.command());;

        System.out.println(processBuilder.directory());
       Map<String,String> environmentVariables = processBuilder.environment();
        System.out.println(environmentVariables.get("JAVA_HOME"));;
        Map<String,String> systemEnvironment = System.getenv();
        System.out.println(systemEnvironment);
        System.out.println(processBuilder.environment());


    }
}
