package com.twu.biblioteca;

import java.util.*;

public class MainMenu {

    ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("1. List Books"));

    public Map<String, String> bookList = new HashMap<String, String>() {{
        put("The Catcher in the Rye", "J.D. Salinger, 1951");
        put("To Kill a Mockingbird", "Harper Lee, 1960");
        put("Life of Pi", "Yann Martel, 2001");
        put("The Prophet", "Kahlil Gibran, 1923");
        put("The Social Animal", "David Brooks, 2011");
    }};

    public void printBookList() {
        System.out.println("Here is our book list:\n\n" + "TITLE                      AUTHOR           YEAR");
        for (Map.Entry<String, String> book : bookList.entrySet()) {
            String[] parts = book.getValue().split(", ");
            String author = parts[0];
            String year = parts[1];
            System.out.printf("%-25s  %-15s  %s%n", book.getKey(), author, year);
        }
    }

    public void printMenu() {
        System.out.println("MAIN MENU");
        for (String item : menuItems) {
            System.out.println(item);
        }
    }

    public void selectFromMenu(int option) {
        if (option == 1) {
            printBookList();
        } else if(option == 2) {
            System.out.print("Goodbye!");
        } else {
            System.out.print("Select a valid option!");
        }
    }

}
