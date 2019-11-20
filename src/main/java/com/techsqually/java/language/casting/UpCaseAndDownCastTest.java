package com.techsqually.java.language.casting;

public class UpCaseAndDownCastTest extends BaseClass {

    public int j = 20;

    public static void main(String[] args) {


        UpCaseAndDownCastTest upCaseAndDownCastTest = (UpCaseAndDownCastTest) new BaseClass();
        System.out.println(upCaseAndDownCastTest.j);

        BaseClass baseClass = new UpCaseAndDownCastTest();
        System.out.println(baseClass.i);


    }
}
