package com.company.IFT;

/**
 * Created by rafaelszuminski on 9/12/17.
 */
public class MathCore {

    public static boolean checkNum(int num){
        if(num < 0){
            return false;
        }else{
            return true;
        }
    }

    public static int generateRandomNumber(int min, int max){
        int randomNum;
        randomNum = min + (int)(Math.random() * max);
        return randomNum;
    }
}
