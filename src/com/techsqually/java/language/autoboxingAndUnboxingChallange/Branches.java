package com.techsqually.java.language.autoboxingAndUnboxingChallange;

import java.util.ArrayList;

public class Branches {

    private String branchName;
    private static ArrayList<Customers> customersArrayList ;

    public ArrayList<Customers> getCustomersArrayList() {
        return customersArrayList;
    }

    public Branches() {
        customersArrayList = new ArrayList<Customers>();
    }

    public Branches(String branchName) {
        this.branchName = branchName;
    }



   public  boolean addNewCustomer(long customerPhoneNo , String customerName){

        if (findPhoneNumber(customerPhoneNo)){
            System.out.println("Customer is already registered with phone No : " + customerPhoneNo);
            return false;
        }else   {
            Customers customers = Customers.addNewCustomer(customerPhoneNo,customerName);
            customersArrayList.add(customers);
            System.out.println("Customer  is registered successfully with phoneNo : " + customerPhoneNo);
            return true;
        }

    }

    public void customerList(){

        if (customersArrayList.size()==0){
            System.out.println("There is no customer in the Branch");
        }else {

            for (int i =0 ; i < customersArrayList.size(); i++){

                System.out.println(i+1 + ". " + customersArrayList.get(i).getCustomerPhoneNo()
                        + " : " + customersArrayList.get(i).getCustomerName()
                );

            }
        }

    }

    private boolean findPhoneNumber(Long customerPhoneNo){



        if (customersArrayList.size() == 0 ){
            return false;
        }else {

            for (int i=0 ; i < customersArrayList.size(); i ++){

                if (customersArrayList.get(i).getCustomerPhoneNo() == customerPhoneNo){
                    return true;
                }
            }
            return false;
        }
    }

}
