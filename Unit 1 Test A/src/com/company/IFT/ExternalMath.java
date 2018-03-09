package com.company.IFT;

/**
 * Created by rafaelszuminski on 9/22/17.
 */
public class ExternalMath {

    public static int rangeIt(int mA, int mB){
        return (mA-mB + 1);
    }


    public static int randomNumber(int min, int max){
        int randomNum;
        randomNum = min + (int)(Math.random() * rangeIt(max,min));
        return randomNum;
    }

}
