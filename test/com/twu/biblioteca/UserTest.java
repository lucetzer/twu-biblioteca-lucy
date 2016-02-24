package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";
    User newUser = new User();

    @Test
    public void testprintMessage() {
        assertEquals(message, newUser.printMessage());
    }

}
