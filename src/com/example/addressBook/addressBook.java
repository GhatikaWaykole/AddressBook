package com.example.addressBook;

import java.util.ArrayList;
import java.util.Scanner;
class personDetail {
    private String firstName,lastName,address,city,state,email;
    long zip,phone;
    /* creating the constructor of the class
    passing paramter to the constructor
     */
    public personDetail(String firstName,String lastName,String address,String city,String state,String email, long zip,long phone){
        this.firstName=firstName;
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
public class addressBook {
    // taking arraylist with class object and it will store the value dynamic
    private static ArrayList<personDetail> list = new ArrayList<personDetail>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        //creating the persondetail class object to add the person detail
        personDetail personDetail = addPerson();
        // person detail object give to the list
        list.add(personDetail);
        for (int i=0;i<list.size();i++){
           addressBook.display(list.get(i)); //display method take the input as list and print the data
        }

    }
    /* addperson method is to take input from the console
    personDetail given as retun type to the method as there are different type of parameter need to return the method
     */
    private static personDetail addPerson(){
        System.out.println("Enter the firstname");
        String firstName= scanner.next();
        System.out.println("Enter the lastname");
        String lastName= scanner.next();
        System.out.println("Enter the address");
        String address= scanner.next();
        System.out.println("Enter the city");
        String city= scanner.next();
        System.out.println("Enter the state");
        String state= scanner.next();
        System.out.println("Enter the email");
        String email= scanner.next();
        System.out.println("Enter the zip");
        long zip= scanner.nextLong();
        System.out.println("Enter the phone of the person");
        long phone= scanner.nextLong();
        personDetail personDetail= new personDetail(firstName,lastName,address,city,state,email,zip,phone);
        return personDetail;
    }
    /* Dispaly method is give to display the persom data
    personDetail class obejct give as the parametr to the Display method
     */
    private static void display(personDetail personDetail){
        System.out.println("firstname"+ personDetail.getFirstName());
        System.out.println("lastname"+personDetail.getLastName());
        System.out.println("address"+personDetail.getAddress());
        System.out.println("city"+personDetail.getCity());
        System.out.println("state"+personDetail.getState());
        System.out.println("email"+ personDetail.getEmail());
        System.out.println("zip"+ personDetail.getZip());
        System.out.println("phone"+personDetail.getPhone());
    }

}