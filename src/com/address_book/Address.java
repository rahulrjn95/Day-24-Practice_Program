package com.address_book;

public class Address {
    public static void main(String[] args){
        AddressBookEntry details = new AddressBookEntry();
        details.setFirstName("Rambabu");
        details.setLastName("Kumar");
        details.setAddress("Sector-47");
        details.setCity("Bhopal");
        details.setState("Madhyapradesh");
        details.setZipCode(123456);
        details.setMobileNumber(748596745);
        details.setEmailAddress("rambabu01@gmail.com");
        System.out.println(details);
    }
}
