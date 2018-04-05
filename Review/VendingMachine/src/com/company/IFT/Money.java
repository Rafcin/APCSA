package com.company.IFT;

/**
 * Created by rafaelszuminski on 12/18/17.
 */

public class Money {

    private int dollars;
    private int cents;

    /*
    Create Money
     */

    public Money(int d, int c){
        if(dollars < 0 || cents < 0)
            throw new IllegalArgumentException("No Negative Money");
        dollars = d;
        cents = c;
    }





    /*
    Getters and Setters
     */

    public int getCents() {
        return cents;
    }

    public int getDollars() {
        return dollars;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }







}
