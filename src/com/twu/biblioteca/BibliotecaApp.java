package com.twu.biblioteca;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintStream;


public class BibliotecaApp {


    private static PrintStream out;
    Library library;
    LibraryItem book1, book2, book3, book4, book5, movie1, movie2, movie3, movie4, movie5;
    User user1, user2, user3;

    private static final int LIBRARYLIST = 1;
    private static final int SIGNIN = 2;
//    private static final int CHECKOUT = 2;
//    private static final int RETURN = 3;
//    private static final int QUIT = 4;
//


    public BibliotecaApp(PrintStream out) {
        this.out = out;
        this.library = new Library(new PrintStream(out));
        book1 = new Book("THE PROPHET", "Kahlil Gibran", "1923");
        book2 = new Book("TO KILL A MOCKINGBIRD", "Harper Lee", "1960");
        book3 = new Book("THE CATCHER IN THE RYE", "J.D. Salinger", "1951");
        book4 = new Book("THE SOCIAL ANIMAL", "David Brooks", "2011");
        book5 = new Book("LIFE OF PI", "Yann Martel", "2001");

        movie1 = new Movie("THE GODFATHER", "1972", "Francis Ford Coppala", "8");
        movie2 = new Movie("THE LIVES OF OTHERS", "2006", "Florian Henckel von Donnersmarck", "8");
        movie3 = new Movie("PLAN 9 FROM OUTER SPACE", "1959", "Edward D. Wood Jr.", "4");
        movie4 = new Movie("THE HUNT", "2012", "Thomas Vinterberg", "8");
        movie5 = new Movie("OLD SCHOOL", "2003", "Todd Phillips", "7");

        user1 = new User("Ringo Starr", "ringo@email.com", "06534374857", "111-2345", "letmein");
        user2 = new User("Amelia Hart", "amelia@email.com", "04545374857", "222-2345", "hellokitty");
        user3 = new User("Jin Chow", "jin@chow.com", "04545356857", "333-2345", "desert353");
    }


    public void setUpLibraryListsAndUsers() {
        library.bookList.add(book1);
        library.bookList.add(book2);
        library.bookList.add(book3);
        library.bookList.add(book4);
        library.bookList.add(book5);

        library.movieList.add(movie1);
        library.movieList.add(movie2);
        library.movieList.add(movie3);
        library.movieList.add(movie4);
        library.movieList.add(movie5);

        library.addToUserList(user1);
        library.addToUserList(user2);
        library.addToUserList(user3);

    }


    public void setUpUsers() {

    }

    public void printWelcomeMsg() {
        out.println("Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!");
    }
//
//    public void printGoodByeMsg() {
//        out.println("Thank you for using Biblioteca. Goodbye");
//    }
//
////    public void printInvalidMsg() {
////        out.print("Select a valid option!");
////    }
//
//    public void printPrompt() {
//        out.print("Please make a selection by entering the number:");
//    }
//
////    public void selectFromMenu(MainMenu menu, int option) {
////        switch(option) {
////            case BOOKLIST:
////                menu.printBookList();
////                prompt();
////                break;
////            case CHECKOUT:
////                getCheckOutBookFromUser(menu);
////                prompt();
////                break;
////            case RETURN:
////                getReturnBookFromUser(menu);
////                prompt();
////                break;
////            case QUIT:
////                printGoodByeMsg();
////                break;
////            default:
////                printInvalidMsg();
////                break;
////        }
////    }
//
//    public void prompt() {
//        printMenu();
//        printPrompt();
//    }
//
//    public enum ActionUserOption {
//
//        BOOKLIST(1),
//        CHECKOUT(2),
//        RETURN(3),
//        QUIT(4);
//
//        int item;
//
//        public static ActionUserOption getOption(int selectedOption) {
//            for(ActionUserOption option : values()) {
//                if (selectedOption == option.item) {
//                    return option;
//                } else {
//                    System.out.print("Select a valid option!");
//                }
//            }
//        }
//
//
//        BOOKLIST {
//            public void go() {
//                menu.printBookList();
//                prompt(menu);
//            }
//        },
//        CHECKOUT {
//            public void go() {
////                getCheckOutBookFromUser(menu);
////                prompt(menu);
//            }
//        },
//        RETURN {
//            public void go() {
////                getReturnBookFromUser(menu);
////                prompt(menu);
//            }
//        },
//        QUIT {
//            public void go() {
////                printGoodByeMsg();
//                System.out.print("Select a valid option!");
//
//            }
//        };
//
//    }
//
//
//    public void getCheckOutBookFromUser(MainMenu menu) {
//        out.println("Please enter the title of the book you wish to checkout:");
//        Scanner scanner = new Scanner(System.in);
//        String titleFromUser = scanner.nextLine();
//        menu.removeBookFromList(titleFromUser);
//    }
//
//    public void getReturnBookFromUser(MainMenu menu) {
//        out.println("Please enter the title of the book you wish to return:");
//        Scanner scanner = new Scanner(System.in);
//        String titleFromUser = scanner.nextLine();
//        menu.returnBook(titleFromUser);
//    }

    public void selectFromMainMenu(int option) {
        switch(option) {
            case LIBRARYLIST:
                out.println("\nBOOKS");
                library.printBookList();
                out.println("\nMOVIES");
                library.printMovieList();
                library.printMenu();
            case SIGNIN:

        }
    }





    public static void main(String[] args) {
        BibliotecaApp biblib = new BibliotecaApp(System.out);
        biblib.setUpLibraryListsAndUsers();
        biblib.printWelcomeMsg();
        biblib.library.menuItems.add("Sign in");


        biblib.library.printMenu();
        Scanner scanner = new Scanner(System.in);
//
        while(true) {
            String line = scanner.next();
            int option = Integer.parseInt(line);
            biblib.selectFromMainMenu(option);
//
////            biblio.selectFromMenu(bookMenu, option);
//            ActionUserOption.getOption(option, bookMenu).go();
        }
    }

}
