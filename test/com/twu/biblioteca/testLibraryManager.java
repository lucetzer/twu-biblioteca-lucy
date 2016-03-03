package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

public class testLibraryManager {

//    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    LibraryManager libraryMgr = new LibraryManager();
    Book book1 = Mockito.mock(Book.class);
    Movie movie1 = Mockito.mock(Movie.class);
    Book book2 = Mockito.mock(Book.class);
    Movie movie2 = Mockito.mock(Movie.class);
    ArrayList<Book> bookList = new ArrayList<Book>();
    ArrayList<Movie> movieList = new ArrayList<Movie>();

    @Before
    public void setUp() {
        bookList.add(book1);
        movieList.add(movie1);
    }

    @Test
    public void libraryCanKeepTrackOfCheckedOutItems() {
        assertEquals(book1, libraryMgr.checkOutItem(bookList, book1));
        assertEquals(movie1, libraryMgr.checkOutItem(movieList, movie1));
    }

    @Test
    public void cannotReturnUnavailableItems() {
        assertEquals("That item is not available.", libraryMgr.checkOutItem(bookList, book2));
        assertEquals("That item is not available.", libraryMgr.checkOutItem(movieList, movie2));
    }


    @Test
    public void itemsCanBeReturned() {
       libraryMgr.checkOutItem(bookList, book1);
        assertEquals(book1, libraryMgr.returnBook(book1));
    }

    @Test
    public void invalidItemToReturn() {
        assertEquals("That is not a valid item to return", libraryMgr.returnBook(book2));
    }
    
}
