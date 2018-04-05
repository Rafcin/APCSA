package com.company.IFT;

import javax.swing.*;

public class Main {

    static StudentV2 senior001;
    static Student freshman001;


    public static void main(String[] args) {

        senior001 = new StudentV2();
        JOptionPane.showMessageDialog(null, senior001.toString());
        System.out.print(senior001);

        System.out.println("------------------------");

        freshman001 = new Student("Annoying","Freshman",9,2.1,false,"Lame old Freshman who tends to annoy everyone.");
        JOptionPane.showMessageDialog(null, freshman001.toString());
        System.out.print(freshman001);


    }
}
