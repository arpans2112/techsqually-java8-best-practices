package com.techsqually.java8Topics.language.autoboxingAndUnboxingChallange;

public class MainClass {

    public static Customers customers = new Customers();
    public static Branches branches = new Branches();

    public static void main(String[] args) {

        branches.addNewCustomer(801867870,"Arpan Saini");
        branches.addNewCustomer(801867871,"Sheel Saini");
        branches.addNewCustomer(801867872,"Sanja Saini");
        branches.addNewCustomer(801867870,"Preeti Saini");
        branches.customerList();

        customers.addTransaction(801867870,"1010",100);
        customers.addTransaction(801867870,"1010",50);
        customers.addTransaction(801867871,"1010",20);

        customers.getTransaction(801867870);
        customers.getTransaction(801867871);
        customers.getTransaction(801867872);
    }

}
