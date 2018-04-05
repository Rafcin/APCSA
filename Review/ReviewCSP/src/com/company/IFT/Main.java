package com.company.IFT;

public class Main {

    public static void main(String[] args) {


        int[] randomNumbers;
        randomNumbers = new int[10];

        for(int I = 0; I<randomNumbers.length;I++){
            randomNumbers[I] = generateRandomNumber(1,100);
        }

        for(int I = 0; I<randomNumbers.length;I++){
            if(randomNumbers[I] > 3){
                System.out.println(randomNumbers[I]+" -- is greater than 3");
            }
        }


    }

    public static int generateRandomNumber(int min, int max){
        int randomNum;
        randomNum = min + (int)(Math.random() * max);
        return randomNum;
    }

}
