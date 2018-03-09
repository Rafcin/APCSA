package com.company.IFT;

public class Main {

    public static void main(String[] args) {

        RightTriangle Triangle1 = new RightTriangle();
        System.out.println(Triangle1.toString());
        System.out.println("------");

        RightTriangle Triangle2 = new RightTriangle();
        Triangle2.setHeight(4);
        Triangle2.setBase(3);
        System.out.println(Triangle2.toString());
        System.out.println("------");
        Triangle2.setBase(6);
        System.out.println(Triangle2.toString());
        System.out.println("------");


    }
}
