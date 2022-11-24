package com.address_book;

import java.util.*;

public class AddressBookMainUC6 {
    private List<PersonDetails> addressbook;
    //Map is used to store data in key and value format.
    //Used create multiple address books
    private Map<String, List> addressBooks = new HashMap<String, List>();

    private static Scanner sc = new Scanner(System.in);

    private void addPerson() {
        System.out.println("Please select the book");
        String bookName = sc.nextLine();
        addressbook = getAddressBook(bookName);
        PersonDetails person = new PersonDetails();
        System.out.println("Enter First Name");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name");
        String lastName = sc.nextLine();
        System.out.println("Enter Address");
        String address = sc.nextLine();
        System.out.println("Enter City");
        String city = sc.nextLine();
        System.out.println("Enter State");
        String state = sc.nextLine();
        System.out.println("Enter Zip code");
        int zipcode = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Phone Number");
        long phoneNumber = Long.parseLong(sc.nextLine());

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setCity(city);
        person.setState(city);
        person.setZipCode(zipcode);
        person.setPhoneNumber(phoneNumber);

        addressbook.add(person);
    }

    private void editPerson() {
        System.out.println("Please select the book");
        String bookName = sc.nextLine();
        addressbook = getAddressBook(bookName);
        System.out.println("Enter the person name");
        String personName = sc.nextLine();
        PersonDetails personDetails = null;
        for (int i = 0; i < addressbook.size(); i++) {
            if (personName.equals(addressbook.get(i).getFirstName()) || personName.equals(addressbook.get(i).getLastName())) {
                personDetails = addressbook.get(i);
                break;
            }
        }
        if (personDetails != null) {
            System.out.println("Enter Address");
            String address = sc.nextLine();
            System.out.println("Enter City");
            String city = sc.nextLine();
            System.out.println("Enter State");
            String state = sc.nextLine();
            System.out.println("Enter Zip code");
            int zipcode = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Phone Number");
            long phoneNumber = Long.parseLong(sc.nextLine());
            personDetails.setAddress(address);
            personDetails.setCity(city);
            personDetails.setState(state);
            personDetails.setZipCode(zipcode);
            personDetails.setPhoneNumber(phoneNumber);
        } else {
            System.out.println("No contacts details found" + personName);
        }
    }

    private void deletePerson() {
        System.out.println("Please select the book");
        String bookName = sc.nextLine();
        addressbook = getAddressBook(bookName);
        System.out.println("Enter the person name");
        String personName = sc.nextLine();
        for (int i = 0; i < addressbook.size(); i++) {
            if (personName.equals(addressbook.get(i).getFirstName()) || personName.equals(addressbook.get(i).getLastName())) {
                addressbook.remove(i);
            } else {
                System.out.println("No contact found");
            }
        }
    }

    private void showaddressbook() {
        System.out.println("Please select the book");
        String bookName = sc.nextLine();
        addressbook = getAddressBook(bookName);
        for (int i = 0; i < addressbook.size(); i++) {
            System.out.println(addressbook.get(i));
        }
    }

    private List<PersonDetails> getAddressBook(String addressBookName) {
        addressbook = addressBooks.get(addressBookName);
        return addressbook;
    }

    private void addAddressBooks() {
        System.out.println("Enter the book name");
        String addressBookName = sc.nextLine();
        addressbook = new ArrayList<PersonDetails>();
        addressBooks.put(addressBookName, addressbook);
        showaddressbooks();
    }

    private void showaddressbooks() {
        for (Map.Entry<String, List> entry : addressBooks.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }

    public static void main(String[] args) {
        boolean isExit = false;
        AddressBookMainUC6 addressbookMainUC6 = new AddressBookMainUC6();

        while (!isExit) {
            System.out.println(" Select option" +
                    "\n1. Add new Address book" +
                    "\n2. Add new person details" +
                    "\n3. Edit person details" +
                    "\n4. Delete Person" +
                    "\n5. show Address book" +
                    "\n6. show total Address books" +
                    "\n7. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addressbookMainUC6.addAddressBooks();
                    break;
                case 2:
                    addressbookMainUC6.addPerson();
                    break;
                case 3:
                    addressbookMainUC6.editPerson();
                    break;
                case 4:
                    addressbookMainUC6.deletePerson();
                    break;
                case 5:
                    addressbookMainUC6.showaddressbook();
                    break;
                case 6:
                    addressbookMainUC6.showaddressbooks();
                    break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid details");
            }
        }
    }
}
