package com.example.IOaddressBook;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class addressBook {
    public static void choice(int choice,PersonDetail object) {
        switch (choice) {
            case 1:
                object.addContactDetail();            //add a new contact into addressbook
                break;

            case 2:
                object.editPersonDetail();                    //edit existing contact
                break;

            case 3:
                object.removePersondetail();                //delete the preferred contact
                break;

            case 4:
                object.dislay();            //display desired contact
                break;
        }
    }
    public static void main(String args[]){
        PersonDetail personDetail= new PersonDetail();
        HashMap<String,PersonDetail> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
       personDetail.addContactDetail();
       String name ="abcda";
       hashMap.put(name,personDetail);
       personDetail.dislay();
        System.out.println("Enter the addressbook which you want to add into file!!");
        String AddressBook=scanner.next();
        try {
            hashMap.get(AddressBook).writeDetail(AddressBook);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
