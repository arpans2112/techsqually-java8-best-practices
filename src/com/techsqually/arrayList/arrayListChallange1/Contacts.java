package com.techsqually.arrayList.arrayListChallange1;

public class Contacts {

    private String name = null;
    private String phoneNumber = null;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
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
