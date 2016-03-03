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
                return true;
            }
        }
        System.out.println("Not a registered or signed in user!");
        return false;
    }






}
