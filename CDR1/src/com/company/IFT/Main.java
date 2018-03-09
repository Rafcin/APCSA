package com.company.IFT;

public class Main {

    public static void main(String[] args) {
        Shape shapeNormal = new Shape();
        System.out.println(shapeNormal);
        System.out.println("--------------------");
        Shape shapeCircle = new Shape("Circle","Red",0,0,8);
        System.out.println(shapeCircle);
        System.out.println("--------------------");
        Shape shapeTriangle = new Shape("Triangle","Blue",4,8,0);
        System.out.println(shapeTriangle);
        System.out.println("--------------------");
        Shape shapeSquare = new Shape("Rectangle","Green",6,5,0);
        System.out.println(shapeSquare);
        System.out.println("--------------------");


    }
}
