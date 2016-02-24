package com.twu.biblioteca;

public class User {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";

//    User(MainMenu menu) {
//        MainMenu menu = new MainMenu();
//    }


    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public String checkOutBook(MainMenu menu) {
        return null;
    }

}
