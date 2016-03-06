package com.twu.biblioteca;

import java.util.Scanner;

public class Input implements UserInput{
    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
