package com.example.IOaddressBook;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class addressbookJSONCompute {
    static Scanner scanner = new Scanner(System.in);
    static JSONObject addressbook = new JSONObject();
    static JSONObject arraylist = new JSONObject();
    public void addDetail(){
        System.out.println("Enter the first Name");
        String firstName = scanner.next();
        addressbook.put("fistName",firstName);
        System.out.println("Enter the last Name");
        String lastName = scanner.next();
        addressbook.put("lastName",lastName);
        System.out.println("Enter your Address: ");
        String address = scanner.next();
        addressbook.put("address",address);
        System.out.println("Enter your city: ");
        String city = scanner.next();
        addressbook.put("city",city);
        System.out.println("Enter your state : ");
        String state = scanner.next();
        addressbook.put("state",state);
        System.out.println("Enter email id: ");
        String email = scanner.next();
        addressbook.put("email",email);
        System.out.println("Enter zip: ");
        String zip = scanner.next();
        addressbook.put("zip",zip);
        System.out.println(" Enter phone number: ");
        String phone = scanner.next();
        addressbook.put("phone",phone);
      //  JSONObject arraylist = new JSONObject();
        arraylist.put("addressbook",addressbook);

    }
    public static void main(String args[]) throws IOException {
      // JSONObject addressbook = new JSONObject();
        addressbookJSONCompute jsoncompute = new addressbookJSONCompute();
        File file = new File("C:\\Users\\PC\\IdeaProjects\\AddressBook\\resources\\addressbookJSONCompute.json");
        jsoncompute.addDetail();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(arraylist.toJSONString());
        fileWriter.flush();
        JSONArray addressbook = (JSONArray) arraylist.get("addressbook");
        Iterator<String> iterator = addressbook.iterator();
        while (iterator.hasNext()){
            System.out.println("addressbook"+iterator.hasNext());
        }
    }
}
