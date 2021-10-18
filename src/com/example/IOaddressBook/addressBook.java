package com.example.IOaddressBook;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class addressBook {
    public static void main(String args[]) throws IOException {
        System.out.println("welcome to addressbook program the compute");
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\PC\\IdeaProjects\\AddressBook\\resources\\addressbookIOCompute.txt");
        try {
            boolean fileCreate = file.createNewFile();
            if (fileCreate) {
                System.out.println("file create properly");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        addressbookIOCompute addressbookIOCompute = new addressbookIOCompute();
        while (true) {
            System.out.println("Choose what to do");
            System.out.println("1) Add a person");
            System.out.println("2) Edit person");
            System.out.println("3) Delete a person");
            System.out.println("4) Sort Address Book");
            System.out.println("5) View person by city or state name");
            System.out.println("6) Search for person in city or state");
            System.out.println("7) View All Contacts");
            System.out.println("8) Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addressbookIOCompute.addDetail();
                    break;
                case 2:
                    addressbookIOCompute.editDetail();
                    break;
                case 3:
                    addressbookIOCompute.deltePersonDetail();
                    break;
                case 4:
                    addressbookIOCompute.sorting();
                    break;
                case 5:
                    addressbookIOCompute.viewByCityOrCity();
                    break;
                case 6:
                    addressbookIOCompute.searchByCityOrCity();
                    break;
                case 7:
                    addressbookIOCompute.displayDetail();
                    break;
                case 8:
                    return;
            }
        }
    }
}

