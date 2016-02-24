package com.twu.biblioteca;

import java.util.*;

public class MainMenu {

    ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("List Books"));

    public void printMenu() {
        System.out.println("MAIN MENU");
        for (String item : menuItems) {
            System.out.println(item);
        }
    }

    public void selectFromMenu(String option) {
        if (option.equals("List books")) {
            WelcomeUser user = new WelcomeUser();
            user.printBookList();
        }
    }

}
