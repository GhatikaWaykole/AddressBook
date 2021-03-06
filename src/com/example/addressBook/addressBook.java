package com.example.addressBook;

import com.example.IOaddressBook.addressbookIOCompute;

import java.io.IOException;
import java.util.*;

public class addressBook {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        AddressBookList addressBook = new AddressBookList();
        Map<String, AddressBookList> addressBookMap = new HashMap<String, AddressBookList>();
        Map<String,addressBook> addressbookHashmap = new HashMap<>();
        while (true) {
            System.out.println("\nWelcome to Address Book System");
            System.out.println("1. New Address Book \n2. Select Address Book \n3. Delete Address Book \n4. Search Contact Data \n5. view \n 6. count the detail \n 7. write detail \n 8. read detail \n 9.Exit");
            System.out.print("Enter Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name of new Address Book: ");
                    String bookName = scanner.next();
                    scanner.nextLine();
                    addressBookMap.put(bookName, new AddressBookList());// adding bookname as a key and vlue is allocating
                    // memory for addressbook obj
                    addressBook.addressBookOptions(addressBookMap.get(bookName));// call addressbookoption method with
                    // passing key of hashmap
                    break;
                case 2:
                    System.out.println("List of available Address Book : ");
                    Set<String> keys = addressBookMap.keySet();// retrived keys from hashmap to show addressbooklist
                    Iterator<String> i = keys.iterator();
                    while (i.hasNext()) {
                        System.out.println(i.next());
                    }
                    System.out.println("Enter Address Book name you want to Open : ");
                    String name = scanner.nextLine();
                    System.out.println("Current Address Book is : " + name);
                    addressBook.addressBookOptions(addressBookMap.get(name));// call method with passing address book name
                    break;
                case 3:
                    System.out.println("Enter Address Book name to be delete: ");
                    name = scanner.nextLine();
                    addressBookMap.remove(name);// delete hashmap using remove fun
                    break;
                case 4:
                    System.out.println("Welcome to the search option:");
                    addressBook.searchByOptions();
                    break;
                case 5:
                    System.out.println("welcome to the view option");
                    addressBook.viewByOption(addressBookMap);
                case 6:
                    System.out.println("welcome to the couter");
                    addressBook.countByOption();
                case 7:
                    addressbookIOCompute ioCompute = new addressbookIOCompute();
           //         ioCompute.writeDetail();
                    break;
                case 8:
                    addressbookIOCompute ioCompute1 = new addressbookIOCompute();
              //      ioCompute1.readDetail();
                    break;
                case 9:
                    scanner.close();// for closing the programme
                    return;
                default:
                    System.out.println("You Entered Invalid Choice....!");
                    break;
            }
        }
    }
}