package com.twu.biblioteca;

public class WelcomeUser {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";
    String bookList;

    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public String printBookList() {
        return bookList;
    }

}
