package com.crickbuzz.datatypes

class Address {
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String country;
    private int zipCode;

    // setters
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipcode;
    }

    //getters
    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return getAdressLine2;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZipCode() {
        return zipCode;
    }
}