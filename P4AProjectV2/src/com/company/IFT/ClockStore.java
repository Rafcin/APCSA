package com.company.IFT;

import java.util.Arrays;

/**
 * Created by rafaelszuminski on 11/29/17.
 */

public class ClockStore {

    //Can Store 3 Clock Items
    public static Clock clocksInStock[] = new Clock[3];

    public ClockStore(){

                                     //H:M:S\\
        clocksInStock[0] = new Clock(12,6,1);
        clocksInStock[1] = new Clock(12,6,6);
        clocksInStock[2] = new Clock(12,9,9);




    }



    @Override
    public String toString() {
        Clock[] tempClocks = new Clock[clocksInStock.length];
        String tempCalc = new String();

        int Index = 0;
        for(Clock c : clocksInStock){
            tempClocks[Index] = c;
            Index++;
        }
        int IndexA = 0;
        for(Clock c : clocksInStock){
            tempCalc = c.mostSeconds(clocksInStock);
            IndexA++;
        }
        return  "|--Clocks--|"+"\n"+
                Arrays.toString(tempClocks)+"\n"+
                "Info: "+tempCalc;

    }
}
