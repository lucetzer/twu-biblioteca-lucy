package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

public class testLibrary {

    private Book book1 = Mockito.mock(Book.class);
    private Book book2 = Mockito.mock(Book.class);
    private Movie movie1 = Mockito.mock(Movie.class);
    private Movie movie2 = Mockito.mock(Movie.class);
    Library library = new Library();

    @Test
    public void canAddBookToLibraryBookList() {
        library.bookList.add(book1);
        library.bookList.add(book2);
        assertEquals(book1, library.bookList.get(0));
        assertEquals(book2, library.bookList.get(1));
        assertEquals(2, library.bookList.size());
    }

    @Test
    public void canAddMovieToLibraryMovieList() {
        library.movieList.add(movie1);
        library.movieList.add(movie2);
        assertEquals(movie1, library.movieList.get(0));
        assertEquals(movie2, library.movieList.get(1));
        assertEquals(2, library.movieList.size());
    }

}
