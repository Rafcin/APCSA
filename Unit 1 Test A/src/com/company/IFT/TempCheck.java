package com.company.IFT;

/**
 * Created by rafaelszuminski on 9/22/17.
 */
public class TempCheck {
    public static String checkTemp(int temp){
        if(temp>=80){
            //"ITS SO HOT OH MY GOD"
            return "Hot!";
        }else if(50<=temp && temp < 80){
            return "Moderate";
        }else if(32 <= temp && temp < 50){
            return "Cold!";
        }else if(temp < 32){
            return "Its Freezing";
        }
        return null;
    }
}
