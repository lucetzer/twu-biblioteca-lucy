package com.twu.biblioteca;

import java.util.Scanner;
import java.io.PrintStream;


public class BibliotecaApp {

    PrintStream out = new PrintStream(System.out);

    Library library = new Library(new PrintStream(out));
    LibraryItem book1, book2, book3, book4, book5, movie1, movie2, movie3, movie4, movie5;
    User user1, user2, user3;
    LibraryManager libMgr = new LibraryManager();
    UserManager userMgr;

    private static final int LIBRARYLIST = 1;
    private static final int SIGNIN = 2;
    private static final int QUIT = 3;
    private static final int CHECKOUT = 4;
    private static final int RETURN = 5;
    private static final int SIGNOUT= 6;


    public BibliotecaApp() {
//        this.out = out;

        library.userMenu.add("Checkout Item");
        library.userMenu.add("Return Book");
        library.userMenu.add("Sign out");

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

        setUpLibraryListsAndUsers();
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
        userMgr = new UserManager(library.getUserList());
    }

    public void printWelcomeMsg() {
        out.println("Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!\n");
    }

    public void selectFromMainMenu(int option) {
        switch(option) {
            case LIBRARYLIST:
                library.printItemList();
                library.printMenu();
                break;
            case SIGNIN:
                out.println("Please enter your library number and password separated by a comma (e.g. 111-1111, password): ");
                getSignInInputFromUser();
                break;
            case QUIT:
                out.println("Thank you for using Biblioteca. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Please select a valid option.");
        }
    }

    public void getSignInInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] info = input.split(", ");
        String libraryNumber = info[0];
        String password = info[1];
        userMgr.signIn(libraryNumber, password);
    }

    public void getOptionFromUserMenu() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
//        identifyItem(line);
//        selectFromUserMenu();
    }

//    public Object identifyItem(String line) {
//
//    }
//
//
//
//
//    public void selectFromUserMenu(int option) {
//        library.printItemList();
//        switch(option) {
//            case CHECKOUT:
//                libMgr.checkedOutItems(option);
//        }
//    }


    public static void main(String[] args) {
        BibliotecaApp biblib = new BibliotecaApp();
        biblib.printWelcomeMsg();
        biblib.library.menuItems.add("Sign in");
        biblib.library.menuItems.add("Quit");
        biblib.library.printMenu();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String line = scanner.next();
            int option = Integer.parseInt(line);
            biblib.selectFromMainMenu(option);
        }
    }

}
