package com.twu.biblioteca;

public class User {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!\n";

    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public void checkOutBook(MainMenu menu, String book) {
        menu.removeBookFromList(book);
    }

    public void returnBook(MainMenu menu, String book) {
        menu.returnBook(book);
    }


}
