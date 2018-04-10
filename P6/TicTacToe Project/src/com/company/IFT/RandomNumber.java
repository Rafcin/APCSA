package com.company.IFT;

/**
 * Created by rafaelszuminski on 4/5/18.
 */

public class RandomNumber {
    public static int grn(int min, int max){
        int randomNum;
        randomNum = min + (int)(Math.random() * max);
        return randomNum;
    }
}