package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;


public class testUser {

    User user = new User("Ringo Starr", "ringo@email.com", "06534374857", "333-2345", "letmein");

    @Test
    public void getUserInfo() {
        String expected = "Ringo Starr      ringo@email.com            06534374857\n";
        assertEquals(expected, user.getUserInfo());
    }



}
