package com.company.IFT;

import com.company.IFT.Math.RandomNumber;

public class Main {

    private static String[] mNames = {"Nick A", "Kaylie", "Jack", "Chris", "Dawson", "Damian", "Quinton", "Kyle", "Nolan", "Felix", "Tyler", "Dennis", "Nick S", "Raf", "Joe", "Grant", "Filip", "Tim", "Leona", "Victor"};

    private static String mName = "Raf";

    public static void main(String[] args) {



        for(int I = 0; I<=5; I++){
            int ranName = RandomNumber.generateRandomNumber(0,19);
            System.out.println(mNames[ranName]);
            System.out.println(mName.compareTo(mNames[ranName]));
            if(mName.compareTo(mNames[ranName]) == 0){
                System.out.println("Winner!");
            }else{
                System.out.println("AHAHHA you lost!");
            }
        }

        System.out.println("NickDif: "+mNames[0].compareTo(mNames[12]));

        // Dif in Characters is shown with Cmpr to so ItemA to ItemB (#of char diffrences)


    }
}
