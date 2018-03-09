package com.company.IFT;

/**
 * Created by rafaelszuminski on 12/19/17.
 */
public class Random {
    public static double rangeIt(double mA, double mB){
        return (mA-mB + 1.0);
    }
    public static double randomNumber(double min, double max){
        double randomNum;
        randomNum = min + (double) (Math.random() * rangeIt(max,min));
        return randomNum;
    }
}


