package com.company.IFT;

public class Main {

    public static void main(String[] args) {

        //Array Size
        int arrayMax  = 10;
        //Create array of arrayMax items.
        int itemArray[] = new int[arrayMax];
        List<String> someList = new ArrayList<String>();


        //Create random numbers
        for(int items : itemArray){
            itemArray[items] = RandomNumber.generateRandomNumber(1,100);
            System.out.println(itemArray[items]);
        }
        for(int searchItems : itemArray){
            if(itemArray[searchItems]>itemArray[searchItems]){

            }
        }

    }
}
