package com.twu.biblioteca;

import java.util.*;

public class MainMenu {

    ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("List Books"));

    public void printMenu() {
        System.out.println("Main Menu");
        for (String item : menuItems) {
            System.out.println(item);
        }
    }


}
