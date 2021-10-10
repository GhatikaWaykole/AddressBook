package com.example.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonDetail {
    private String firstName,lastName,address,city,state,email;
    long zip,phone;
    static Scanner scanner = new Scanner(System.in);

    /* creating the constructor of the class
    passing parameter to the constructor
     */

    public PersonDetail() {
    }

    public PersonDetail(String firstName, String lastName, String address, String city, String state, String email, long zip, long phone){
        this.firstName = firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.email=email;
        this.zip=zip;
        this.phone=phone;
    }
    /* get and set method used to access the private variable of the class
    main class use this variable with the class object
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
