package com.company.omicronics;

import java.util.ArrayList;

/**
 * Created by rafaelszuminski on 8/30/17.
 */

public class QuadraticFormula {


    public static void main(String[] args) {

        //Test Values
        int a = 1;
        int b = -2;
        int c = -15;

        //Test Values
        int a2 = 1;
        int b2 = 3;
        int c2 = 4;


        System.out.println("|--------Init Values--------|");
        System.out.println("Int A: "+a);
        System.out.println("Int B: "+b);
        System.out.println("Int C: "+c);
        System.out.println("|--------End--------|");


        System.out.println("|--------Part-A--------|");
        System.out.println(quadIt(a,b,c));
        System.out.println("|--------Part-B--------|");
        System.out.println(quadIt(a2,b2,c2));


    }

    private static ArrayList<Double> quadIt(int a, int b, int c){
        ArrayList<Double> results = new ArrayList<Double>();
        double sqrtTemp,rootA,rootB;
        sqrtTemp = Math.pow(b, 2) - (4 * a * c);
        rootA = ((-1 * b) + Math.sqrt(sqrtTemp)) / (2 * a);
        rootB = ((-1 * b) - Math.sqrt(sqrtTemp)) / (2 * a);
        results.add(rootA);
        results.add(rootB);
        return results;


    }



}
