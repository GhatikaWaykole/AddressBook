package com.example.IOaddressBook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class addressbookIOCompute {
    static Scanner scanner = new Scanner(System.in);
    LinkedList<PersonDetail> linkedList = new LinkedList<PersonDetail>();
    HashMap<String,String> hashMapCity = new HashMap<>();
    HashMap<String,String> hashMapState = new HashMap<>();

    public boolean checkPerson(String phoneNumber) {
        for (PersonDetail person : this.linkedList) {
            if (phoneNumber.equalsIgnoreCase(person.getPhone())) {
                return true;
            }
        }
        return false;
    }
    public static void personDetail(PersonDetail personDetail){
            System.out.println("Enter your Address: ");
            personDetail.setAddress(scanner.next());
            System.out.println("Enter your city: ");
            personDetail.setCity(scanner.next());
            System.out.println("Enter your state : ");
            personDetail.setState(scanner.next());
            System.out.println("Enter email id: ");
            personDetail.setEmail(scanner.next());
            System.out.println("Enter zip: ");
            personDetail.setZip(scanner.next());
            System.out.println(" Enter phone number: ");
            personDetail.setPhone(scanner.next());
        }
        public void addDetail(){
        PersonDetail personDetail = new PersonDetail();
        System.out.println("Enter the first Name");
        personDetail.setFirstName(scanner.next());
        System.out.println("Enter the last Name");
        personDetail.setLastName(scanner.next());
        personDetail(personDetail);
        boolean duplicateCheck = this.checkPerson(personDetail.getPhone());
        if(duplicateCheck == false){
            linkedList.add(personDetail);
            hashMapCity.put(personDetail.getCity(),personDetail.getFirstName());
            hashMapState.put(personDetail.getState(),personDetail.getFirstName());
            System.out.println("detail added properly");
        }
        else{
            System.out.println("detail exist enter another adressbook data");
        }
        }
        public PersonDetail getPersonDetail(){
            System.out.println("Enter First Name!!!");
            String firstName = scanner.next();
            System.out.println("Enter Last Name!!!");
            String lastName = scanner.next();

            for (PersonDetail person : this.linkedList) {
                if (firstName.equalsIgnoreCase(person.getFirstName()) && lastName.equalsIgnoreCase(person.getLastName())) {
                    return person;
                }
            }
            return null;
        }
        public void displayDetail() throws IOException {
            FileWriter fileWriter = null;
            fileWriter = new FileWriter("C:\\Users\\PC\\IdeaProjects\\AddressBook\\resources\\addressbookIOCompute.txt");
            try{
                for (PersonDetail personDetail : linkedList){
                    System.out.println(personDetail);
                    fileWriter.write(personDetail+System.lineSeparator());
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
            finally {
                fileWriter.close();
            }
        }
        public void editDetail(){
        PersonDetail personDetail = this.getPersonDetail();
        if(personDetail != null){
            personDetail(personDetail);
        }
        }
        public void deltePersonDetail(){
            PersonDetail personToDelete=this.getPersonDetail();
            if(personToDelete != null)
            {
                this.linkedList.remove(personToDelete);
                System.out.println("Contact Deleted Successfully");
            }
            else
                System.out.println("Invalid Details");
        }
    public void sorting() {
        System.out.println("Enter the type according to which you want to sort : 1)First Name 2)City 3)state 4)zipcode");
        int option = scanner.nextInt();
        switch (option) {
            case 1: this.linkedList.sort(Comparator.comparing(PersonDetail:: getFirstName));
                break;
            case 2: this.linkedList.sort(Comparator.comparing(PersonDetail:: getCity));
                break;
            case 3: this.linkedList.sort(Comparator.comparing(PersonDetail:: getState));
                break;
            case 4: this.linkedList.sort(Comparator.comparing(PersonDetail:: getZip));
                break;
        }
    }

    public void viewByCityOrCity() {
        System.out.println("Enter City or State Name");
        String name = scanner.next();
        if (hashMapCity.containsKey(name)) {
            System.out.println(hashMapCity.get(name));
        } else {
            System.out.println(hashMapState.get(name));
        }
    }
    public void searchByCityOrCity() {
        System.out.println("Enter City or State Name");
        String name = scanner.next();
        for (HashMap.Entry<String, String> pair : hashMapCity.entrySet()) {
            if (hashMapCity.containsKey(name)) {
                System.out.println(hashMapCity.get(name));
            }
        }
        for (HashMap.Entry<String, String> pair : hashMapState.entrySet()) {
            if (hashMapState.containsKey(name)) {
                System.out.println(hashMapState.get(name));
            }
        }
    }
}
