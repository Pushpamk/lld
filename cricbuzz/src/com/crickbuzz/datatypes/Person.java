package com.crickbuzz.datatypes

public class Person {
    private String firstName;
    private String secondName;
    private Address address;
    private String phoneNumber;
    private String email;

    // setters
    public void setFirstName(String firstName) {
        this.fristName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phonenumber;
    }

    public void setEmail(String email) {
        this.email = email)
    }

    // getters
    public String getFirstName() {
        return firstname;
    }

    public String getSecondName() {
        return secondName;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
}