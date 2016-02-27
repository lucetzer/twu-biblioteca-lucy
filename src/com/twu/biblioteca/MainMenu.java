package com.twu.biblioteca;

import java.util.*;

public class MainMenu {

    ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("List Books"));

    Map<String, String> bookList = new TreeMap<String, String>() {{
        put("THE PROPHET", "Kahlil Gibran, 1923");
        put("TO KILL A MOCKINGBIRD", "Harper Lee, 1960");
        put("THE CATCHER IN THE RYE", "J.D. Salinger, 1951");
        put("THE SOCIAL ANIMAL", "David Brooks, 2011");
        put("LIFE OF PI", "Yann Martel, 2001");
    }};

    String bookToRemove;
    String bookToRemoveAuthorYear;
    Map<String, String> checkedOutItems = new TreeMap<String, String>();

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
        System.out.println("\nMAIN MENU");
        int index = 0;
        for (String item : menuItems) {
            index += 1;
            System.out.println(index + ". " + item);
        }
    }

    public void addMenuItem(String item) {
        menuItems.add(item);
    }

    public void removeBookFromList(String book) {
        String selectedBook = book.toUpperCase();
        for (Map.Entry<String, String> entry : bookList.entrySet()) {
            String title = entry.getKey();
            if (title.equals(selectedBook)) {
                bookToRemove = title;
                bookToRemoveAuthorYear = bookList.get(bookToRemove);
                registerBookToBeCheckedOut();
                System.out.println("You have successfully checked out " + bookToRemove + " by " + bookToRemoveAuthorYear + ". Thank you! Enjoy the book.");
            }
        }
        if (bookToRemove != null) {
            bookList.remove(bookToRemove);
        } else {
            System.out.print("That book is unavailable. Please select a book from the list.");
        }
    }

    public void registerBookToBeCheckedOut() {
        checkedOutItems.put(bookToRemove, bookToRemoveAuthorYear);
    }

    public void returnBook(String book) {
        String bookToReturn = book.toUpperCase();
        if (!checkedOutItems.containsKey(bookToReturn)) {
            System.out.println("That is not a valid book to return.");
        }
        for (Map.Entry<String, String> entry : checkedOutItems.entrySet()) {
            String title = entry.getKey();
            if (title.equals(bookToReturn)) {
                bookList.put(title, entry.getValue());
                System.out.println("Thank you for returning the book.");
            }
        }
    }



}