package com.twu.biblioteca;

import java.util.*;

public class MainMenu {

    ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("List Books"));

    public Map<String, String> bookList = new TreeMap<String, String>() {{
        put("1. The Prophet", "Kahlil Gibran, 1923");
        put("2. To Kill a Mockingbird", "Harper Lee, 1960");
        put("3. The Catcher in the Rye", "J.D. Salinger, 1951");
        put("4. The Social Animal", "David Brooks, 2011");
        put("5. Life of Pi", "Yann Martel, 2001");
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
        int index = 0;
        for (String item : menuItems) {
            index += 1;
            System.out.println(index + ". " + item);
        }
    }

    public void addMenuItem(String item) {
        menuItems.add(item);
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
