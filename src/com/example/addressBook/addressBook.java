package com.example.addressBook;

import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class addressBook {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<PersonDetail> arraylist = new ArrayList<>();
    public static Map<String, ArrayList<PersonDetail>> hashmap = new HashMap<>();

    public static void addContactDetail() {
        System.out.println("Enter the firstname");
        String firstName = scanner.next();
        System.out.println("Enter the lastname");
        String lastName = scanner.next();
        System.out.println("Enter the address");
        String address = scanner.next();
        System.out.println("Enter the city");
        String city = scanner.next();
        System.out.println("Enter the state");
        String state = scanner.next();
        System.out.println("Enter the email");
        String email = scanner.next();
        System.out.println("Enter the zip");
        long zip = scanner.nextLong();
        System.out.println("Enter the phone of the person");
        long phone = scanner.nextLong();
        PersonDetail personDetail = new PersonDetail(firstName, lastName, address, city, state, email, zip, phone);
        arraylist.add(personDetail);
    }

    public static boolean editContactDetail() {
        int flag = 0;
        System.out.println("Enter the name want to edit the detail");
        String name = scanner.next();
        for (PersonDetail contact : arraylist) {
            if (contact.getFirstName().equals(name)) {
                System.out.println("Enter the detail you want to update in the contact data");
                System.out.println("1 first name edit");
                System.out.println("2. Last name edit");
                System.out.println("3. Address detail edit");
                System.out.println("4. City detail edit");
                System.out.println("5. State detail edit");
                System.out.println("6. email detail edit");
                System.out.println("7. Zip detail edit");
                System.out.println("8. Phone number edit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the first name");
                        contact.setFirstName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter the last name");
                        contact.setLastName(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter the address data");
                        contact.setAddress(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Enter the city data");
                        contact.setCity(scanner.nextLine());
                        break;
                    case 5:
                        System.out.println("Enter the state data");
                        contact.setState(scanner.nextLine());
                        break;
                    case 6:
                        System.out.println("Enter the email data");
                        contact.setEmail(scanner.nextLine());
                        break;
                    case 7:
                        System.out.println("Enter the zip data");
                        contact.setZip(scanner.nextLong());
                        break;
                    case 8:
                        System.out.println("Enter the phone number data");
                        contact.setPhone(scanner.nextLong());
                        break;
                }
            }
            flag = 1;
            break;
        }
        return flag == 1;
    }

    public static boolean deleteContactDetail() {
        int flag = 0;
        System.out.println("Enter the name you want to remove from the addressbook data");
        String name1 = scanner.next();
        for (PersonDetail contact : arraylist) {
            if (contact.getFirstName().equals(name1)) {
                arraylist.remove(contact);
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }

    public static void display() {
        for (PersonDetail personDetail : arraylist) {
            System.out.println(personDetail);
        }
    }
    /**
     * Method to check for duplicate entry before adding the person.
     */
    public static void duplicateCheck(String firstName) {
        for (int k = 0; k < arraylist.size(); k++) {
            String contactName = arraylist.get(k).getFirstName();

            if (firstName.equals(contactName)) {
                System.out.println("This Person is Already Present");
            } else {
                System.out.println("You can Add this Person");
                break;
            }
        }
    }
    public static void createAddressBook() {
        boolean flag = true;
        while (flag) {
            while (true) {
                System.out.println("Choose what you want to do: ");
                System.out.println("1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
                int choose = scanner.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("Enter the name of address book: ");
                        String address_name = scanner.next();

                        // condition to check for uniqueness of address book.
                        if (hashmap.containsKey(address_name)) {
                            System.out.println("Adress book name exits, enter different name");
                            break;
                        }

                        ArrayList<PersonDetail> new_address_book = new ArrayList<>();
                        arraylist = new_address_book;
                        while (true) {
                            System.out.println("Choose what you want to do: ");
                            System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Dipslay all contacts. \n5.Duplicate check.\n6.Exit");
                            int choose1 = scanner.nextInt();
                            if (choose1 == 6) {
                                System.out.println("Exited");
                                break;
                            }
                            switch (choose1) {
                                case 1:
                                    addContactDetail();
                                    break;
                                case 2:
                                    editContactDetail();
                                    break;
                                case 3:
                                    deleteContactDetail();
                                    break;
                                case 4:
                                    display();
                                    break;
                                case 5:
                                    System.out.println("Enter first name to check for duplicancy");
                                    String enteredName = scanner.next();
                                    duplicateCheck(enteredName);
                                    break;

                                default:
                                    System.out.println("Choose valid option");
                                    break;
                            }
                            hashmap.put(address_name, arraylist);
                            System.out.println(hashmap);
                        }
                        break;
                    case 2:
                        System.out.println("Enter the name of address book: ");
                        String address_name_old = scanner.next();

                        // condition to check whether address book exists or no.
                        if (hashmap.containsKey(address_name_old)) {

                            ArrayList<PersonDetail> old_address_book = new ArrayList<>();
                            arraylist = old_address_book;
                            arraylist = hashmap.get(address_name_old);
                            while (true) {
                                System.out.println("Choose what you want to do: ");
                                System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Display contact.\n5.Exit");
                                int choice = scanner.nextInt();
                                switch (choice) {
                                    case 1:
                                        addContactDetail();
                                        break;
                                    case 2:
                                        System.out.println("Enter the name to edit the detail");
                                        String name = scanner.next();
                                        editContactDetail();
                                        break;
                                    case 3:
                                        System.out.println("Enter the name want to remove from the contact detail");
                                        String name1 = scanner.next();
                                        deleteContactDetail();
                                        break;
                                    case 4:
                                        display();
                                        break;
                                    default:
                                        System.out.println("Choose valid option");
                                        break;
                                }

                            }
                        } else {
                            System.out.println("Enter valid address book name");
                        }
                        break;

                    case 3:
                        System.out.println(hashmap);
                        break;

                    default:
                        System.out.println("Enter valid option");

                }
            }
        }
    }

            public static void main (String[]args){
                System.out.println("Welcome to Address Book Program");
                createAddressBook();
            }
        }