package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WelcomeUserTest {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";
    String bookList = "Here is our booklist:\n\n" + "TITLE                      AUTHOR           YEAR\n" +
        "The Catcher in the Rye     J.D. Salinger    1951\n" +
        "To Kill a Mockingbird      Harper Lee       1960\n" +
        "Life of Pi                 Yann Martel      2001\n" +
        "The Prophet                Kahlil Gibran    1923\n" +
        "The Social Animal          David Brooks     2011";

    WelcomeUser newUser = new WelcomeUser();

    @Test
    public void testprintMessage() {
        assertEquals(message, newUser.printMessage());
    }


    @Test
    public void testprintBookList() {
        System.out.println(bookList);
        assertEquals(bookList, newUser.printBookList());
    }
}
