package com.twu.biblioteca;

import java.util.*;

public class WelcomeUser {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";
    public Map<String, String> bookList = new HashMap<String, String>() {{
        put("The Catcher in the Rye", "J.D. Salinger, 1951");
        put("To Kill a Mockingbird", "Harper Lee, 1960");
        put("Life of Pi", "Yann Martel, 2001");
        put("The Prophet", "Kahlil Gibran, 1923");
        put("The Social Animal", "David Brooks, 2011");
    }};

    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public void printBookList() {
        System.out.println("Here is our book list:\n\n" + "TITLE                      AUTHOR           YEAR");
        for (Map.Entry<String, String> book : bookList.entrySet()) {
            String[] parts = book.getValue().split(", ");
            String author = parts[0];
            String year = parts[1];
            System.out.printf("%-25s  %-15s  %s%n", book.getKey(), author, year);
        }
    }

}
