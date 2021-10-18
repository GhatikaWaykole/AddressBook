package com.example.IOaddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonDetail {
    ArrayList<PersonDetail> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private String firstName, lastName, address, city, state, email;
    String zip;
    String phone;
    /* creating the constructor of the class
        passing parameter to the constructor
         */
    public PersonDetail() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phone = phone;
    }

    public ArrayList<PersonDetail> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<PersonDetail> arrayList) {
        this.arrayList = arrayList;
    }

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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // method to add the person detail the addressbook
    public void addContactDetail() {
        System.out.println("Enter the First Name: ");
        String firstName = scanner.next();
        System.out.println("Enter the Last Name: ");
        String lastName = scanner.next();
        System.out.println("Enter your Address: ");
        String address = scanner.next();
        System.out.println("Enter your city: ");
        String city = scanner.next();
        System.out.println("Enter your state : ");
        String state = scanner.next();
        System.out.println("Enter email id: ");
        String email = scanner.next();
        System.out.println("Enter zip: ");
        long zip = scanner.nextLong();
        System.out.println(" Enter phone number: ");
        long phoneNumber = scanner.nextLong();
        //  arrayList.add(new PersonDetail(firstName, lastName, address, city, state, email, zip, phoneNumber));
    }
}