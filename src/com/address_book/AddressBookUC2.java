package com.address_book;

import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class AddressBookUC2 {
    // class variable
    static final Scanner scanner = new Scanner(System.in);
    static Set<String> emptyContacts = new HashSet<>();

    // instance method
    void createNewContact() throws Exception
    {
        System.out.print("Enter name of the contact:");
        String contactName = scanner.nextLine();
        File file = new File(contactName);
        if (file.exists())
        {
            System.out.println("contact " + file.getName() + " already exists!");
        }
        else
        {
            if (file.createNewFile())
            {
                System.out.println("new contact " + file.getName() + " is created successfully");
                emptyContacts.add(file.getName());
            }
            else
            {

                System.out.println("file creation failed!");
            }
        }

    }

    void fillContactDetails() throws Exception
    {
        System.out.print("enter empty contact name which is going to be filed:");
        String contactName = scanner.nextLine();
        if (emptyContacts.contains(contactName))
        {

            FileWriter fw = new FileWriter(contactName);
            String details = "";
            System.out.print("enter first name:");
            details += scanner.nextLine() + "\n";
            System.out.print("enter last name:");
            details += scanner.nextLine() + "\n";
            System.out.print("enter address:");
            details += scanner.nextLine() + "\n";
            System.out.print("enter city:");
            details += scanner.nextLine() + "\n";
            System.out.print("enter state:");
            details += scanner.nextLine() + "\n";
            System.out.print("enter zip:");
            details += scanner.nextLine() + "\n";
            System.out.print("enter phone number:");
            details += scanner.nextLine() + "\n";
            fw.write(details);
            fw.close();
        }
        else
        {
            System.out.println(contactName + " is not empty contact or it is not created");
            System.out.println("use other option 1 to create new contact");
        }

    }
}
