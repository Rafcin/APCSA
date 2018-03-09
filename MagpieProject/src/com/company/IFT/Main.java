package com.company.IFT;

import java.util.Scanner;

public class Main {

    /**
     * Create a Magpie, give it user input, and print its replies.
     */

    public static void main(String[] args)
    {
        Magpie4 maggie = new Magpie4();
        String statement = "I want to build a robot.";
        System.out.println("Statement: " + statement);
        System.out.println("Response: " + maggie.getResponse(statement));
    }

}
