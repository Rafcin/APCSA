package com.company.omicronics;

import java.util.Map;
import java.util.Random;

public class RandomSquares {


    public static void main(String[] args) {
        int i;

        System.out.print("Initial"+"\t"+"Square"+"\t"+"Ran"+"\t");
        for (i=0; i <=10; i++) {
            if(i==0){
                System.out.println("");
            }
            System.out.println(i + "\t" + magic(i)+"\t" + randomNumber(i,magic(i))+"\t");
        }


    }

    //wows
    public static int magic(int mNum){

        int result;
        result = (int) Math.pow(mNum,2);

        return result;
    }

    public static int rangeIt(int mA, int mB){
        return (mA-mB + 1);
    }


    public static int randomNumber(int min, int max){
        int randomNum;
        randomNum = min + (int)(Math.random() * rangeIt(max,min));
        return randomNum;
    }

}




//Me: Hey Denny look at this
//Denny: I don't get it.
//Me: its you every time we work on a project.
//Denny: ...
//-End-