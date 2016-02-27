package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class testBibliotecaApp {

    BibliotecaApp biblioteca = new BibliotecaApp();

    @Test
    public void testAssessUserInput() {
        String message = "Select a valid option!";
        assertEquals(message, biblioteca.assessUserInput("hello"));
    }

}
