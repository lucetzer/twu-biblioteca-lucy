package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {

    ArrayList<String> userMenu = new ArrayList<String>();
    private static final String INVALID_MSG = "Incorrect library number or password. Returning you back to the main menu.";
    private static final int DETAILS = 1;
    private static final int CHECKOUT = 2;
    private static final int RETURN = 3;
    private static final int SIGNOUT= 4;
    Library library;
    User currentUser;

    public UserManager(Library library) {
        this.library = library;
        userMenu.add("My details");
        userMenu.add("Check out item");
        userMenu.add("Return item");
        userMenu.add("Sign out and back to main menu");
    }

    public boolean signIn(String libraryNumber, String password) {
        for (User user : library.getUserList()) {
            if (user.getLibraryNumber().equals(libraryNumber) && user.getPassword().equals(password)) {
                user.changeStatus();
                currentUser = user;
                System.out.println("You have successfully signed in.");
                printMenu();
                return true;
            }
        }
        System.out.println(INVALID_MSG);
        library.printMenu();
        return false;
    }

    public void printMenu() {
        System.out.println("\nUSER MENU");
        int index = 0;
        for (String item : userMenu) {
            index += 1;
            System.out.println(index + ". " + item);
        }
        System.out.println("Please select a number:");
        getOptionFromUserMenu();
    }

    public void selectFromUserMenu(int option, User currentUser) {
        switch(option) {
            case DETAILS:
                currentUser.getUserInfo();
                printMenu();
                break;
            case CHECKOUT:
                library.printItemList();
                System.out.println("Please enter the title you wish to borrow:");
                getCheckOutItemFromUser();
                printMenu();
                break;
            case RETURN:
                System.out.println("Please enter the title you wish to return:");
                getReturnItemFromUser();
                printMenu();
            printMenu();
                break;
            case SIGNOUT:
                currentUser.signOut();
                library.printMenu();
                break;
            default:
                System.out.println("Please select a valid option");
        }
    }

    public void getOptionFromUserMenu() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        int option = Integer.parseInt(line);
        selectFromUserMenu(option, currentUser);
    }

    public void getCheckOutItemFromUser() {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine().toUpperCase();
        System.out.println(title);
        library.checkOutItem(title, currentUser);
    }

    public void getReturnItemFromUser() {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine().toUpperCase();
        System.out.println(title);
        library.returnItem(title, currentUser);
    }

}
