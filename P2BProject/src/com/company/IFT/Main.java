package com.company.IFT;

public class Main {

    static HumanDriver mHumanA;
    static HumanDriver mHumanB;


    public static void main(String[] args) {
        mHumanA = new HumanDriver();
        System.out.print( mHumanA );
        mHumanB = new HumanDriver("Smith","Happy",true,16);
        System.out.print( mHumanB );

    }
}
