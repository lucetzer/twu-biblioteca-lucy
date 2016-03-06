package com.twu.biblioteca;

import java.util.Scanner;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BibliotecaApp {

    PrintStream out;
    Library library = new Library();
    LibraryItem book1, book2, book3, book4, book5, movie1, movie2, movie3, movie4, movie5;
    User user1, user2, user3;
    UserManager userMgr;

    private static final int LIBRARYLIST = 1;
    private static final int SIGNIN = 2;
    private static final int QUIT = 3;
    private static final String PASS_MSG = "Please enter your library number and password separated by a comma and space (e.g. 111-1111, password): ";

    public BibliotecaApp(PrintStream out) {
        this.out = out;

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
        userMgr = new UserManager(library, new PrintStream(out));

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

    public void printWelcomeMsg() {
        out.println("Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!\n");
    }

    public void selectFromMenu(int option) {
        switch(option) {
            case LIBRARYLIST:
                library.printItemList();
                library.printMenu();
                break;
            case SIGNIN:
                out.println(PASS_MSG);
                getSignInInputFromUser();
                break;
            case QUIT:
                out.println("Thank you for using Biblioteca. Goodbye!");
                System.exit(0);
            default:
                out.println("Please select a valid option.");
        }
    }

    public void getSignInInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(",\\s\\S\\w");
        Matcher checkInput = pattern.matcher(input);
        boolean  b = checkInput.find();
        if (b) {
            String[] info = input.split(", ");
            String libraryNumber = info[0];
            String password = info[1];
            userMgr.signIn(libraryNumber, password);
        } else {
            System.out.println(PASS_MSG);
        }
    }

    public static void main(String[] args) {
      new BibliotecaApp(System.out).run();

    }

    public void run() {
        printWelcomeMsg();
        library.menuItems.add("Sign in");
        library.menuItems.add("Quit");
        library.printMenu();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String line = scanner.next();
            int option = Integer.parseInt(line);
            selectFromMenu(option);
        }
    }

}
