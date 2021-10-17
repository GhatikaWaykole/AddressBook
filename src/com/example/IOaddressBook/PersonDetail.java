package com.example.IOaddressBook;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonDetail {
    ArrayList<PersonDetail> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private String firstName, lastName, address, city, state, email;
    long zip, phone;

    /* creating the constructor of the class
    passing parameter to the constructor
     */
    public PersonDetail(){

    }
    public PersonDetail(String firstName, String lastName, String address, String city, String state, String email, long zip, long phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
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
        arrayList.add(new PersonDetail(firstName, lastName, address, city, state, email, zip, phoneNumber));
    }

    //write the data to the file
    public void writeDetail(String file) throws IOException {
        FileWriter writer = new FileWriter(file + ".txt", true);
        for (int i = 0; i < arrayList.size(); i++) {
            PersonDetail object = arrayList.get(i);
            writer.write("first Name" + object.firstName + "last Name" + object.lastName + "address" + object.address + "city" + object.city + "state" + object.state + "email" + object.email + "zip" + object.zip + "number" + object.phone);
        }
        writer.close();
    }

    public void readDetail(PersonDetail file) {
        try {
            FileReader reader = new FileReader(file + ".txt");
            int i = 0;
            while (reader.read() != -1) {
                System.out.println((char) reader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //method display the person detail the addressbook
    public void dislay() {
        System.out.println("Enter the name want to display the data");
        String name = scanner.next();
        for (int i = 0; i < arrayList.size(); i++) {
            PersonDetail object = arrayList.get(i);
            if (object.firstName.equals(name)) {
                System.out.println("first Name: " + object.firstName);
                System.out.println("last Name: " + object.lastName);
                System.out.println("address: " + object.address);
                System.out.println("city: " + object.city);
                System.out.println("state : " + object.state);
                System.out.println("email id: " + object.email);
                System.out.println("zip: " + object.zip);
                System.out.println("phone: " + object.phone);
            }
        }
    }

    //method to edit the person data the addressbook
    public void editPersonDetail() {
        System.out.println("Enter the name want to edit the data");
        String name = scanner.next();
        for (int i = 0; i < arrayList.size(); i++) {
            PersonDetail object = arrayList.get(i);
            if (object.firstName.equals(name)) {
                System.out.println("want to edit the \n 1. first Name 2.last Name 3.address 4.city 5.state 6.email 7.zip 8.phone");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        object.firstName = scanner.next();
                        break;
                    case 2:
                        object.lastName = scanner.next();
                        break;
                    case 3:
                        object.address = scanner.next();
                        break;
                    case 4:
                        object.city = scanner.next();
                        break;
                    case 5:
                        object.state = scanner.next();
                        break;
                    case 6:
                        object.email = scanner.next();
                        break;
                    case 7:
                        object.zip = scanner.nextLong();
                        break;
                    case 8:
                        object.phone = scanner.nextLong();
                        break;
                }
            }
        }
    }

    //method to remove the person detail the addressbook
    public void removePersondetail() {
        System.out.println("Enter the name want to remove the addressbook");
        String name = scanner.next();
        for (int i = 0; i < arrayList.size(); i++) {
            PersonDetail object = arrayList.get(i);
            if (object.firstName.equals(name)) {
                arrayList.remove(object);
            }
        }
    }
}
