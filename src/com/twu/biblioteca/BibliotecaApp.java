package com.twu.biblioteca;

import java.util.Scanner;


public class BibliotecaApp {

    private static final int BOOKLIST = 1;
    private static final int CHECKOUT = 2;
    private static final int RETURN = 3;
    private static final int QUIT = 4;


    public void selectFromMenu(MainMenu menu, int option, User user) {
        switch(option) {
            case BOOKLIST:
                menu.printBookList();
                prompt(menu);
                break;
            case CHECKOUT:
                getCheckOutBookFromUser(user, menu);
                prompt(menu);
                break;
            case RETURN:
                getReturnBookFromUser(user, menu);
                prompt(menu);
                break;
            case QUIT:
                System.out.print("Goodbye!");
                break;
            default:
                System.out.print("Select a valid option!");
                break;
        }

    }

    public void prompt(MainMenu menu) {
        menu.printMenu();
        System.out.println("Please make a selection by entering the number:");
    }

    public void getCheckOutBookFromUser(User user, MainMenu menu) {
        System.out.println("Please enter the title of the book you wish to checkout:");
        Scanner scanner = new Scanner(System.in);
        String titleFromUser = scanner.nextLine();
        user.checkOutBook(menu, titleFromUser);
    }

    public void getReturnBookFromUser(User user, MainMenu menu) {
        System.out.println("Please enter the title of the book you wish to return:");
        Scanner scanner = new Scanner(System.in);
        String titleFromUser = scanner.nextLine();
        user.returnBook(menu, titleFromUser);
    }

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        User user = new User();
        user.printMessage();
        MainMenu libraryMenu = new MainMenu();
        libraryMenu.addMenuItem("Checkout book");
        libraryMenu.addMenuItem("Return book");
        libraryMenu.addMenuItem("Quit");
        libraryMenu.printMenu();

        System.out.println("Please make a selection by entering the number:");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String line = scanner.next();
            int option = Integer.parseInt(line);
            biblioteca.selectFromMenu(libraryMenu, option, user);
        }
    }

}
