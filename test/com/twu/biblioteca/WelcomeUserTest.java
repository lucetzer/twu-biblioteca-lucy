package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class WelcomeUserTest {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";
    String bookList = "Here is our book list:\n\n" + "TITLE                      AUTHOR           YEAR\n" +
        "The Prophet                Kahlil Gibran    1923\n" +
        "To Kill a Mockingbird      Harper Lee       1960\n" +
        "The Catcher in the Rye     J.D. Salinger    1951\n" +
        "The Social Animal          David Brooks     2011\n" +
        "Life of Pi                 Yann Martel      2001\n";

    WelcomeUser newUser = new WelcomeUser();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testprintMessage() {
        assertEquals(message, newUser.printMessage());
    }

    @Test
    public void testprintBookList() {
        newUser.printBookList();
        assertEquals(bookList, outContent.toString());
    }

}
