package com.address_book;


public class PersonDetails {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private long phoneNumber;

    //Constructor
    public PersonDetails(){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
        this.phoneNumber=phoneNumber;
    }
    //Getter Methods
    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }
    public String getAddress() {

        return address;
    }

    public String getCity() {

        return city;
    }

    public String getState() {

        return state;
    }

    public int getZipCode() {

        return zipcode;
    }

    public long getPhoneNumber() {

        return phoneNumber;
    }

    //Setter Methods
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
    public void setAddress(String address) {

        this.address = address;
    }

    public void setCity(String city) {

        this.city= city;
    }

    public void setState(String state) {

        this.state= state;
    }

    public void setZipCode(int zip) {

        this.zipcode = zipcode;
    }

    public void setPhoneNumber(long phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return  "\nFirstName : "+this.firstName +" LastName : "+this.lastName +" Address : "+this.address + "City : "+this.city +" State : "+this.state +" ZipCode : "+this.zipcode +" PhoneNumber : "+this.phoneNumber;
    }
}
