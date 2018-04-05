package com.company.IFT;

import javax.swing.*;

public class Main {

    public static String mPass = new String ("R@f*^!#(*)&!)");

    public static void main(String[] args) {
        //Count the first 3 check everything on 5 or whatevr number and after.
        System.out.println(mPass.substring(1,2));
        System.out.println(mPass.substring(3,4));

        String atCheckA  = new String (mPass.substring(1,2));

        JFrame frame = new JFrame("Box");
        String code = JOptionPane.showInputDialog(
                frame,
                "Type password or something:",
                JOptionPane.WARNING_MESSAGE
        );

        if(code.length() >= 6 && code.matches(".*[!@#$%^&*()_+].*")){
            System.out.println("YAY!");
        }else{
            System.out.println("BOO!");
        }



    }
}
