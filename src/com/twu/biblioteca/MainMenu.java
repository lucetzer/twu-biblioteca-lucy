package com.twu.biblioteca;

import java.util.*;

public class MainMenu {

    ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("1. List Books"));

    public void printMenu() {
        System.out.println("MAIN MENU");
        for (String item : menuItems) {
            System.out.println(item);
        }
    }

    public void selectFromMenu(int option) {
        if (option == 1) {
            WelcomeUser user = new WelcomeUser();
            user.printBookList();
        } else {
            System.out.print("Select a valid option!");
        }
    }

}
