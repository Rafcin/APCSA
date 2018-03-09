package com.company.IFT;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        fizzBuzz(30);
        fizzBuzz(55);
        JFrame frame = new JFrame("Sample Fizz Int");
        int value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Input N"));
        fizzBuzz(value);
    }

    public static void fizzBuzz(int max){
        System.out.println("---------------------------------------------");
        for (int i=1; i <= max; i++)
        {
            if(i % 15 == 0){
                //FizzBuzz
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                //Fizz
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                //Buzz
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
        System.out.println("---------------------------------------------");
    }
    
    private static boolean isDivible(int number, int divisor){
        return number % divisor == 0;
    }

}