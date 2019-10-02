package com.techsqually.java.language.autoboxingAndUnboxingChallange;

import java.util.ArrayList;


public class Customers {

    private ArrayList<Transactions> transactionsArrayList ;

    private String customerName ;
    private  long customerPhoneNo;


    public Customers() {
        this.transactionsArrayList = new ArrayList<Transactions>();

    }

    public Customers(long customerPhoneNo , String customerName) {
        this.customerPhoneNo = customerPhoneNo;
        this.customerName = customerName;

    }

    public String getCustomerName() {
        return customerName;
    }



    public long getCustomerPhoneNo() {
        return customerPhoneNo;
    }



    //Adding a New Transaction in Transaction array List
    public boolean addTransaction(long customer_PhoneNo , String transaction_code, double transction_amount){

        Transactions transactions = Transactions.addTransaction(customer_PhoneNo,transaction_code,transction_amount);
        return  this.transactionsArrayList.add(transactions);

    }


    public boolean getTransaction(long customerPhoneNo){

        if (transactionsArrayList.size()==0){

            System.out.println("There is no Transaction for Customer registered with phone number  : " +  customerPhoneNo);
            return false;

        }else {

            if (findPhoneNumber(customerPhoneNo)){

                System.out.println("Transaction History of Customer registered with phone number are as follow: " +  customerPhoneNo);

                for (int i=0 ; i<transactionsArrayList.size(); i++){

                    if (transactionsArrayList.get(i).getCustomer_PhoneNo() == customerPhoneNo){

                        String tranCode =   transactionsArrayList.get(i).getTransaction_code();
                        double tranamount =  transactionsArrayList.get(i).getTransction_amount();
                        System.out.println("Tran Code : " + tranCode + " , Tran Amount : " +  Double.toString(tranamount));

                    }

                }
                return true;

            }else

                System.out.println("There is no Transaction for Customer registered with phone number  : " +  customerPhoneNo);
                return false;
        }

    }

    private boolean findPhoneNumber(Long customerPhoneNo){

        for (int i=0 ; i < transactionsArrayList.size(); i ++){

            if (transactionsArrayList.get(i).getCustomer_PhoneNo() == customerPhoneNo){
                return true;
            }
        }
     return false;
    }

    public static Customers addNewCustomer(long customerPhoneNo , String customerName){
        return new Customers(customerPhoneNo, customerName);
    }




}
