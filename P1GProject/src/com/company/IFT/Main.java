package com.company.IFT;

import java.util.ArrayList;
import java.util.List;

public class Main {




    public static void main(String[] args) {

        int size;
        size = 10;

        int[] randomNumbers;
        randomNumbers = new int[size];

        ArrayList<Integer> intListNeg = new ArrayList<Integer>();
        ArrayList<Integer> intListPos = new ArrayList<Integer>();


        for(int I = 0; I<randomNumbers.length;I++){
            randomNumbers[I] = MathCore.generateRandomNumber(-60,100);
        }
        System.out.println("[Original]-----------------------------------");
        for(int I = 0; I<randomNumbers.length;I++){
            System.out.println(randomNumbers[I]+" ");
        }
        System.out.println("[+10]-----------------------------------");
        for(int I = 0; I<randomNumbers.length;I++){
            randomNumbers[I] = randomNumbers[I]+10;
            System.out.println(randomNumbers[I]+" ");
        }
        System.out.println("[TYPES]-----------------------------------");
        for(int I = 0; I<randomNumbers.length;I++){
            if(MathCore.checkNum(randomNumbers[I]) == false){
                intListNeg.add(randomNumbers[I]);
                System.out.println(randomNumbers[I]+" is Negative");

            }else{
                intListPos.add(randomNumbers[I]);
                System.out.println(randomNumbers[I]+" is Positive");
            }
        }
        System.out.println("[AMT]-----------------------------------");

        System.out.println("NegCount "+intListNeg.size());
        System.out.println("PosCount "+intListPos.size());


    }

}

