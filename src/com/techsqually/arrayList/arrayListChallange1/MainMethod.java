package com.techsqually.arrayList.arrayListChallange1;

import java.util.Scanner;

public class MainMethod {

    public static MobilePhone mobilePhone = new MobilePhone();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;

        while (!quit){
            System.out.println("\nEnter action: (6 To show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){

                case 0:
                    System.out.println("Sutting down ...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 6:
                    printActions();

            }


        }





    }

    private static void addContact() {

        System.out.println("Enter New Contact Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter New Phone Number : ");
        String phoneNumber = scanner.nextLine();
        Contacts contacts = Contacts.createContact(name,phoneNumber);
        mobilePhone.addContact(contacts);
    }


    public static void printActions(){

        System.out.println("\nAvailable Actions:\npress");
        System.out.println("0 - To ShutDown the phone....\n" +
                "1 - To print Contact List\n" +
                "2 - To add a new Contact\n" +
                "3 - To update an existing Contact\n" +
                "4 - To Remove an exiting Contact\n" +
                "5 - query if an existing Contact Exist\n" +
                "6 - To print the list of available actions." );
        System.out.println("Choose Your action: ");
    }

}
