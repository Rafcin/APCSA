package com.company.IFT;

import com.sun.tools.javac.util.ArrayUtils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numArray = new int[10];

        for(int I = 0; I<10; I++){
            numArray[I] = RandomNumber.generateRandomNumber(1,50);
        }

        System.out.println(numArray.length);
        System.out.println(Arrays.toString(numArray));

        JFrame frame = new JFrame("Search Box");
        String code = JOptionPane.showInputDialog(
                frame,
                "Search For:",
                JOptionPane.WARNING_MESSAGE
        );

        if(contains(numArray,Integer.parseInt(code))){
            System.out.print("Found");
        }else{
            System.out.print("Nope "+code+ " not found");
        }


    }

    public static boolean contains(final int[] array, final int key){
        Arrays.sort(array);
        return Arrays.binarySearch(array, key)>=0;
    }

}
