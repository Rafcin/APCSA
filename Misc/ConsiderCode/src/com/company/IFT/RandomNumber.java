package com.company.IFT;

/**
 * Created by rafaelszuminski on 10/18/17.
 */
public class RandomNumber {
    public static int generateRandomNumber(int min, int max){
        int randomNum;
        randomNum = min + (int)(Math.random() * max);
        return randomNum;
    }
}
