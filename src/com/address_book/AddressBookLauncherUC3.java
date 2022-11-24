package com.address_book;

import java.util.Scanner;

public class AddressBookLauncherUC3 {
    // class variable
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        AddressBookUC3 addressBook = new AddressBookUC3();
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1.create a new contact");
            System.out.println("2.fill contact details");
            System.out.println("3.display all contacts");
            System.out.println("4.view contact information");
            System.out.println("5.edit contact information");
            System.out.println("6.exit");
            System.out.print("enter option:");
            String option = scanner.nextLine().trim();
            switch (option) {
                case "1":
                    addressBook.createNewContact();
                    break;
                case "2":
                    addressBook.fillContactDetails();
                    break;
                case "3":
                    addressBook.displayAllContacts();
                    break;
                case "4":
                    addressBook.viewContactInfo();
                    break;
                case "5":
                    addressBook.editContactInfo();
                    break;
                case "6":
                    System.out.println("exiting....");
                    System.exit(0);
                default:
                    System.out.println("please enter the correct choice");
                    break;
            }

        }

    }
}
