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

    public void checkOutBook(MainMenu menu, String bookNumber) {
        menu.removeBookFromList(bookNumber);
//        menu.printBookList();
    }

}
