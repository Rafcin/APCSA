package com.company.IFT;

import java.util.ArrayList;

public class Main {

    public static ArrayList<String> familyList = new ArrayList<String>();


    public static void main(String[] args) {

        familyList.add("Raf");
        familyList.add("Katrina");
        familyList.add("Jr");
        familyList.add("Greta");

        System.out.println("Size: "+familyList.size());

        for(String s : familyList){
            System.out.println(s);
        }

        for(int Index = 0;Index < familyList.size(); Index++){
           System.out.println(familyList.get(Index));
        }


    }
}
