package com.twu.biblioteca;

import java.util.ArrayList;

public class UserManager {

    private ArrayList<User> userList;

    public UserManager(ArrayList<User> userList) {
        this.userList = userList;
    }

    public boolean signIn(String libraryNumber, String password) {
        for (User user : userList) {
            if (user.getLibraryNumber().equals(libraryNumber) && user.getPassword().equals(password)) {
                user.changeStatus();
                System.out.println("You have successfully signed in.");
//                printUserMenu();
                return true;
            }
        }
        System.out.println("Incorrect library number or password.");
//        printMenu();
        return false;
    }

}
