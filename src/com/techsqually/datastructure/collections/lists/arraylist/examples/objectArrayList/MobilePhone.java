package com.techsqually.datastructure.collections.lists.arraylist.examples.objectArrayList;

import java.util.ArrayList;

public class MobilePhone {


    private String myNumber;
    private ArrayList<Contacts> myContacts;


    //Constructor of MobilePhone Class
    public MobilePhone() {
        this.myContacts = new ArrayList<Contacts>();
    }


    //Add a new contact to Contact ArrayList
    public boolean addContact(Contacts contacts){

        if (findContact(contacts)>=0){
            System.out.println(" Contact is already on the file");
            return false;
        }else{

            if (myContacts.add(contacts)){
                System.out.println("Contact ( " + contacts.getName() +
                        " : " + contacts.getPhoneNumber() + " ) is added successfully");
            }
            return true;
        }

    }


    public boolean updateContact(Contacts oldContact, Contacts newContact){

        int foundPositionOldContact = findContact(oldContact);

        if (findContact(oldContact) <= 0){
            System.out.println(oldContact.getName() + " : was Not Found !! ");
            return false;
        }else{
            myContacts.set(foundPositionOldContact, newContact);
            System.out.println(oldContact.getName() + " is Replaced with " + newContact.getName());
            return true;
        }

    }

    public String queryContact(Contacts contacts){

        int foundPositionOldContact = findContact(contacts);

        if (foundPositionOldContact < 0){
            System.out.println(contacts.getName() + " : was not found !!");
            return null;
        }else {

            return "Contact Name : " + contacts.getName() + "Contact Number : " + contacts.getPhoneNumber();
        }

    }


    public boolean removeContact(Contacts contacts){

        int foundPositionOldContact = findContact(contacts);

        if (findContact(contacts) <= 0){
            System.out.println(contacts.getName() + " : was Not Found !! ");
            return false;
        }else{
            myContacts.remove(foundPositionOldContact);
            System.out.println(contacts.getName() + " is Removed Successfully");
            return true;
        }

    }


    public void printContactList(){

        System.out.println("Contact List : ");
        for (int i=0 ; i < myContacts.size(); i++){

            System.out.println( i + 1 + "." +
                                 myContacts.get(i).getName() + " : " +
                                 myContacts.get(i).getPhoneNumber()
            );

        }

    }

    //Find a contact in Contact ArrayList
    private int findContact(Contacts contacts){
           return myContacts.indexOf(contacts);
    }


    //Find a contactByContactName and Return the index of the Contact Object where it belongs too
    private int findContact(String contactNumber){

        for(int i =0 ; i < myContacts.size(); i++){

            Contacts contacts = myContacts.get(i);
            if (contacts.getPhoneNumber().equals(contactNumber))
                return i;
               else
                return -1;
        }

        System.out.println("There is no contact in myContacts Array List");
        return -1;
    }




}
