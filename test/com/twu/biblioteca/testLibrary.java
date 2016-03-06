package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class testLibrary {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Book book1 = Mockito.mock(Book.class);
    private Book book2 = Mockito.mock(Book.class);
    private Movie movie1 = Mockito.mock(Movie.class);
    private Movie movie2 = Mockito.mock(Movie.class);
//    Library library = new Library(new PrintStream(outContent));
    Library library = new Library();
    private User user1 = Mockito.mock(User.class);


    Book book3 = Mockito.spy(new Book("LIFE OF PI", "Yann Martel", "2001"));
    Book book4 = Mockito.spy(new Book("THE CATCHER IN THE RYE", "J.D. Salinger", "1951"));
    Book book5 = Mockito.spy(new Book("TO KILL A MOCKINGBIRD", "Harper Lee", "1960"));

    Movie movie3 = Mockito.spy(new Movie("THE LIVES OF OTHERS", "2006", "Florian Henckel von Donnersmarck", "8"));
    Movie movie4 = Mockito.spy(new Movie("28 DAYS LATER", "2002", "Danny Boyle", "7"));

    String expectedItemList =
            "LIFE OF PI                 Yann Martel      2001\n" +
                    "THE CATCHER IN THE RYE     J.D. Salinger    1951\n" +
                    "TO KILL A MOCKINGBIRD      Harper Lee       1960\n" +
                    "THE LIVES OF OTHERS        2006   Florian Henckel von Donnersmarck  8\n" +
                    "28 DAYS LATER              2002   Danny Boyle                7";

//    @Test
//    public void testAddMenuItem() throws IOException {
//        library.menuItems.add("Quit");
//        library.printMenu();
//        String actual = outContent.toString().trim();
//        assertEquals("MAIN MENU\n1. List library items\n2. Quit\nPlease make a selection by entering the number:", actual);
//    }



//    @Test
//    public void canPrintItemList() {
//        library.bookList.add(book3);
//        library.bookList.add(book4);
//        library.bookList.add(book5);
//        library.movieList.add(movie3);
//        library.movieList.add(movie4);
//        library.printItemList();
//        String actual = outContent.toString().trim();
//        assertEquals(expectedItemList, actual);
//    }

    @Before
    public void setUp() {
        library.bookList.add(book1);
        library.bookList.add(book2);
        library.movieList.add(movie1);
        library.movieList.add(movie2);
    }

    @Test
    public void canAddBookToLibraryBookList() {
        assertEquals(book1, library.bookList.get(0));
        assertEquals(book2, library.bookList.get(1));
        assertEquals(2, library.bookList.size());
    }

    @Test
    public void canAddMovieToLibraryMovieList() {
        assertEquals(movie1, library.movieList.get(0));
        assertEquals(movie2, library.movieList.get(1));
        assertEquals(2, library.movieList.size());
    }

    @Test
    public void canAddAndGetUserList() {
        library.addToUserList(user1);
        assertEquals(user1, library.getUserList().get(0));
    }

}
