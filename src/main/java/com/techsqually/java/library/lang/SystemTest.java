package com.techsqually.java.library.lang;

public class SystemTest {


    public static void main(String[] args) {

        /*
        * System.arraycopy(Object source, int sourceStart,Object target , int targetStart, int Size)
        * System.clearProperty() -> To clear environment property
        * System.console() -> Returns the console associated with the JVM. Null is returned if the JVM currently has no console
        * System.currentTimeMillis() ->
        * System.exit(int exitCode)
        * System.gc -> to initiages the garbage collector
        * System.getenv() -> Reutrns has map that contains system environment properties
        * System.Logger getLogger(String logName) -> Returns a reference to an object that can be used for program logging.
        *           The name of the logger is passed in logName
        * System.getProperties() -> Returns the properties assocaiated with the java run time system
        * System.getProperties(String which , String default)
        * System.getSecurityManager()
        * System.lineSeparator() -> returns a string that contains the line -separator characters
        * System.load(String libraryFileName)
        * System.loadLibrary(String library)
        * System.nanoTime()
        * runFinalization()
        * System.setErr(PrintStream eStream)
        * System.setIn(PrintStream eStream)
        * System.setOut(PrintStream eStream)
        * System.setProperty(PrintStream eStream)
//        * System.setSecurityManager(SecurityManager secMan)*/

        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("java.vm.name"));
        System.out.println(System.getProperty("oine.separator"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.compiler"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.version.date"));



    }
}