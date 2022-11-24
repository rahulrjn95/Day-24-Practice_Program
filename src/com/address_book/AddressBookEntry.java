package com.address_book;

public class AddressBookEntry {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private long mobilenumber;
    private String emailaddress;

    public AddressBookEntry(String firstname, String lastname, String address, String city, String state, int zipcode, long mobilenumber, String emailaddress) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.mobilenumber = mobilenumber;
        this.emailaddress = emailaddress;
    }
    public AddressBookEntry(){

    }
    public String getCity(){

        return city;
    }
    public void setCity(String city){

        this.city = city;
    }
    public long getMobileNumber(){

        return mobilenumber;
    }
    public void setMobileNumber(long mobilenumber){

        this.mobilenumber = mobilenumber;
    }
    public String getEmailAddress(){

        return emailaddress;
    }
    public void setEmailAddress(String emailaddress){

        this.emailaddress = emailaddress;
    }
    public String getState(){

        return state;
    }
    public void setState(String state){

        this.state = state;
    }
    public int getZipCode(){

        return zipcode;
    }
    public void setZipCode(int zipcode){
        this.zipcode = zipcode;
    }
    public String getAddress(){

        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getFirstName(){

        return firstname;
    }
    public void setFirstName(String firstname){

        this.firstname = firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public void setLastName(String lastname){

        this.lastname = lastname;
    }
    public String toString(){
        return "Address[FirstName ="+ firstname+ ",LastName="+lastname+",Address="+address+",City="+city+",State="+state+",ZipCode="+zipcode+",MobileNumber="+mobilenumber+",EmailAddress="+emailaddress+"]";

    }
}
