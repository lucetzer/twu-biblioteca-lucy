package com.twu.biblioteca;

import java.util.ArrayList;

public class UserManager {

    private ArrayList<User> userList;
    public ArrayList<String> userMenu = new ArrayList<String>();

    public UserManager(ArrayList<User> userList) {
//       super()
        this.userList = userList;
        userMenu.add("Checkout Item");
        userMenu.add("Return Book");
        userMenu.add("Sign out");
    }

    public boolean signIn(String libraryNumber, String password) {
        for (User user : userList) {
            if (user.getLibraryNumber().equals(libraryNumber) && user.getPassword().equals(password)) {
                user.changeStatus();
                System.out.println("You have successfully signed in.");
                return true;
            }
        }
        System.out.println("Not a registered or signed in user!");
        return false;
    }

}
