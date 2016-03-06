package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import org.junit.Before;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class testUserManager {

    Library lib = Mockito.spy(new Library());
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    UserManager userMgr = new UserManager(lib, new PrintStream(outContent));
    User user1 = Mockito.spy(new User("Ringo Starr", "ringo@email.com", "06534374857", "333-2345", "letmein"));

    @Before
    public void setUp() {
        lib.addToUserList(user1);
    }

    @Test
    //not sure why test keeps running
    public void testUserCanSuccessfullySignIn() {
        lib.addToUserList(user1);
        assertEquals(true, userMgr.signIn("333-2345", "letmein"));
    }

    @Test
    public void testUnsuccessfulUserLogin() {
        assertEquals(false, userMgr.signIn("333-2345", "password"));
    }

    @Test
    //not sure why test keeps running
    public void canPrintUserMenu() {
        userMgr.printMenu();
        String actual = outContent.toString().trim();
        assertEquals("test", actual);
    }

    @Test
    public void userCannotSeeDetailsWithoutBeingSignedIn() {
        userMgr.selectFromUserMenu(1, user1);
        String actual = outContent.toString().trim();
        assertEquals("Please sign in to see your details.", actual);
    }


}