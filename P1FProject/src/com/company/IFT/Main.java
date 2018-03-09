package com.company.IFT;

public class Main {



    public static void main(String[] args) {

        int[] randomNumbers;
        randomNumbers = new int[10];

        for(int I = 0; I<randomNumbers.length;I++){
            randomNumbers[I] = generateRandomNumber(1,100);
        }
        System.out.println(" ");
        System.out.println("[A]------------------------");
        for(int I = 0; I<randomNumbers.length;I++){
            System.out.print(randomNumbers[I]+" ");
        }
        System.out.println(" ");
        System.out.println("[B]------------------------");

        int sumOfNum = 0;
        for(int I = 0; I<randomNumbers.length;I++){
            sumOfNum += randomNumbers[I];
            System.out.println(sumOfNum);
        }
        System.out.println("[C]------------------------");
        for(int I = randomNumbers.length-1; I>=0  ;I--){
            System.out.println(randomNumbers[I]);
        }

    }

    public static int generateRandomNumber(int min, int max){
        int randomNum;
        randomNum = min + (int)(Math.random() * max);
        return randomNum;
    }
}
