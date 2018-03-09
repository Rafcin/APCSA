package com.company.omicronics;

import java.util.ArrayList;

public class P1CProject {

    public static void main(String[] args) {

        int firstInt = 1;
        int secondInt = 204;
        int thirdInt = 399;
        int fourthInt = 4;
        int zeroInt = (int) Math.PI/5%3;

        ArrayList<Integer> intData= new ArrayList<>();
        //This is dumb doing repetative arraylist.add hence I created a forloop for randoms but it failed.
        //So now this... hooray...
        intData.add(firstInt);
        intData.add(secondInt);
        intData.add(thirdInt);
        intData.add(fourthInt);
        intData.add(zeroInt);

        checkOE(intData);
    }

    public static void checkOE(ArrayList<Integer> num){
        int x = 0;
        int tempInt;
        for(x=0; x <=num.size()-1; x++){
            tempInt = num.get(x);
            if(tempInt%2==0 && tempInt != 0){
                System.out.println(tempInt+" is Even");
            }else if(tempInt != 0){
                System.out.println(tempInt+" is Odd");
            }
            if(tempInt == 0){
                System.out.println(tempInt+" is not Even or Odd");
            }
        }

    }
}
