package com.techsqually.datastructure.collections.lists.arraylist.examples.objectArrayList;

public class Contacts {

    private String name = null;
    private String phoneNumber = null;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contacts() {
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static Contacts createContact(String name, String phoneNumber){

        return new Contacts(name, phoneNumber);
    }


}
