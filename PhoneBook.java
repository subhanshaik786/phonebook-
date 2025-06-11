import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    // Main method
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Phone Book Menu ====");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String number = scanner.nextLine();
                    phoneBook.put(name, number);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Name to Search: ");
                    name = scanner.nextLine();
                    if (phoneBook.containsKey(name)) {
                        System.out.println("Phone Number: " + phoneBook.get(name));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Delete: ");
                    name = scanner.nextLine();
                    if (phoneBook.containsKey(name)) {
                        phoneBook.remove(name);
                        System.out.println("Contact deleted successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("\n-- All Contacts --");
                    if (phoneBook.isEmpty()) {
                        System.out.println("Phone book is empty.");
                    } else {
                        for (String key : phoneBook.keySet()) {
                            System.out.println("Name: " + key + ", Phone: " + phoneBook.get(key));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting Phone Book. Goodbye!");
                    break;

                default:
