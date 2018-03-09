package com.company.IFT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static int[] satellites = new int[0];
    static int numSattellites;

    public static void main(String[] args) {
        satelliteMenu("Enter Number of Sattellites","Data:");
    }

    //Make the menu. For later use please import rafcore.menus.templatea
    public static void satelliteMenu(String btnName, String dataTxt){

        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        final JButton clickMeButton = new JButton(btnName);
        clickMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int dataSize = Integer.parseInt(JOptionPane.showInputDialog("Num of Sats: "+dataTxt));
                int[] tempArray = new int[dataSize];
                satellites = tempArray;
                System.out.println(satellites.length);
                System.out.println("-------------------------------------------");
                System.out.println("");
                System.out.println("Satellite"+"\t"+"Altitude"+"\t"+"Orbit Location"+"\t");
                JOptionPane.showMessageDialog(null,"Data Added: " + dataSize);
                System.out.println("");
                createData();
            }
        });

        frame.getContentPane().add(clickMeButton);
        frame.pack();

        frame.setVisible(true);
    }

    public static int rangeIt(int mA, int mB){
        return (mA-mB + 1);
    }


    public static int randomNumber(int min, int max){
        int randomNum;
        randomNum = min + (int)(Math.random() * rangeIt(max,min));
        return randomNum;
    }

    public static void createData(){
        try {
        int count = 1;
            for(int satOrder = 0; satOrder<=satellites.length; satOrder++) {
                satellites[satOrder] = count;
                count++;
                int tempRan;
                tempRan = randomNumber(5000,200000);
                System.out.println(satellites[satOrder]+"\t"+tempRan+"\t"+checkOrbit(tempRan)+"\t");
            }
        } catch (Exception e) { /* do nothing */ }
    }

    public static String checkOrbit(int orbitAlt){
        if(orbitAlt<10000){
            //"Not Good"
            return "Not Good";
        }else if(10000<= orbitAlt && orbitAlt<50000){
            //"Low Earth Orbit"
            return "Low Earth Orbit";
        }else if(50000 <= orbitAlt && orbitAlt < 150000){
            //"High Earth Orbit"
            return "High Earth Orbit";
        }else if(orbitAlt>=150000){
            //"You're out there orbit"
            return "You're out there orbit";
        }
        return null;
    }

}
