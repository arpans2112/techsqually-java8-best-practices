package com.techsqually.autoboxingAndUnboxingChallange;

public class Transactions {

    private String transaction_code;
    private double transction_amount;
    private long customer_PhoneNo;

    public Transactions(long customer_PhoneNo , String transaction_code, double transction_amount) {
        this.transaction_code = transaction_code;
        this.transction_amount = transction_amount;
        this.customer_PhoneNo = customer_PhoneNo;
    }

    public long getCustomer_PhoneNo() {
        return customer_PhoneNo;
    }

    public void setCustomer_PhoneNo(long customer_PhoneNo) {
        this.customer_PhoneNo = customer_PhoneNo;
    }

    public void setTransaction_code(String transaction_code) {
        this.transaction_code = transaction_code;
    }

    public void setTransction_amount(double transction_amount) {
        this.transction_amount = transction_amount;
    }

    public String getTransaction_code() {
        return transaction_code;
    }

    public double getTransction_amount() {
        return transction_amount;
    }

    public static Transactions addTransaction(long customer_PhoneNo , String transaction_code, double transction_amount){
        return new Transactions(customer_PhoneNo,transaction_code,transction_amount);
    }
}
