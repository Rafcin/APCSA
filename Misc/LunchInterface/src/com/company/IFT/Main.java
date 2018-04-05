package com.company.IFT;

public class Main {

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        Salad salad = new Salad();
        Drink drink = new Drink();
        Trio trio = new Trio(sandwich,salad,drink);
        System.out.println(trio.getName()+trio.getPrice());
    }
}
