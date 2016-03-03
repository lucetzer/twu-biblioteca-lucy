package com.twu.biblioteca;

public class User {

//    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!\n";
//
//
//    public String printMessage() {
//        System.out.println(message);
//        return message;
//    }

//    public void checkOutBook(MainMenu menu, String book) {
//        menu.removeBookFromList(book);
//    }
//
//    public void returnBook(MainMenu menu, String book) {
//        menu.returnBook(book);
//    }

    String name, email, phoneNumber, libraryNumber, password;

    public User(String name, String email, String number, String libraryNumber, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = number;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getUserInfo() {
        return String.format("%-15s  %-25s  %s%n", name, email, phoneNumber);
    }


}
