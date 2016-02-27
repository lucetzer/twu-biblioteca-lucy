package com.twu.biblioteca;

import java.util.Scanner;


public class BibliotecaApp {


    public void selectFromMenu(MainMenu menu, int option, User user) {
        if (option == 1) {
            menu.printBookList();
            menu.printMenu();
            System.out.println("Please make a selection by entering the number:");
        } else if (option == 2) {
            getCheckOutBookFromUser(user, menu);
            menu.printMenu();
            System.out.println("Please make a selection by entering the number:");
        } else if (option == 3) {
            getReturnBookFromUser(user, menu);
            menu.printMenu();
            System.out.println("Please make a selection by entering the number:");
        } else if (option == 4) {
            System.out.print("Goodbye!");
        } else {
            System.out.print("Select a valid option!");
        }

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
            if (option > libraryMenu.menuItems.size()) {
                scanner.nextLine();
            }
            scanner.nextLine();
        }
    }

}
