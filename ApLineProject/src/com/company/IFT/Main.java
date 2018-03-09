package com.company.IFT;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------");


        ApLine line1 = new ApLine(5,4,-17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5,-2);

        System.out.println(slope1);
        System.out.println(onLine1);

        System.out.println("---------");

        ApLine line2 = new ApLine(-20,40,30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5,-2);

        System.out.println(slope2);
        System.out.println(onLine2);

        System.out.println("---------");


    }
}
