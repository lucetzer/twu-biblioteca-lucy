package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class testBibliotecaApp {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    BibliotecaApp bibApp = new BibliotecaApp(new PrintStream(outContent));
    Library library = Mockito.mock(Library.class);
    User user1 = Mockito.mock(User.class);

    @Test
    public void shouldDisplayWelcomeMessage() throws Exception {
        bibApp.printWelcomeMsg();
        String actual = outContent.toString().trim();
        String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";
        assertEquals(message, actual);
    }

    @Test
    //not sure how to test this
    public void anyUserCanSeeLibraryItems() {
        String expected = "test";
        bibApp.selectFromMenu(1);
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }

//    @Test
//    public void usersCanSignIn() {
//        bibApp.selectFromMenu(2);
//        String actual = outContent.toString().trim();
////        assertEquals("Please enter your library number and password separated by a comma and space (e.g. 111-1111, password)", actual);
//    }

    @Test
    public void testInvalidOption() {
        bibApp.selectFromMenu(8);
        String actual = outContent.toString().trim();
        assertEquals("Please select a valid option.", actual);
    }

    @Test
    //not sure how to complete the exit test
    public void testQuitOption() {
        bibApp.selectFromMenu(3);
        String actual = outContent.toString().trim();
        assertEquals("Thank you for using Biblioteca. Goodbye!", actual);
    }

}
