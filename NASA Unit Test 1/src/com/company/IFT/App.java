package com.company.IFT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rafaelszuminski on 9/19/17.
 */
public class App {

    public static int[] numSatellites;

    public static void main(String[] args) {
        createDataMenu("Enter Data","Data: ");

    }

    public static void createDataMenu(String btnName, String dataTxt){

        final JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        final JButton clickMeButton = new JButton(btnName);
        clickMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int dataSize = Integer.parseInt(JOptionPane.showInputDialog(dataTxt));
                int[] tempArray = new int[dataSize];
                numSatellites = tempArray;
                System.out.println(numSatellites.length);
                System.out.println("-------------------------------------------");
                System.out.println("");
                System.out.println("Satellite"+"\t"+"Altitude"+"\t"+"Orbit Location"+"\t");
                JOptionPane.showMessageDialog(null,"Data Added: " + dataSize);
                activateSatelliteData();
                System.out.println("");
                System.out.println("-------------------------------------------");
            }
        });

        frame.getContentPane().add(clickMeButton);
        frame.pack();

        frame.setVisible(true);
    }

    public static void activateSatelliteData(){
        for(int satOrder = 1; satOrder<=numSatellites.length+1; satOrder++){
            numSatellites[satOrder] = satOrder;
            System.out.println(satOrder);
        }
    }

    public static void fillSattelliteAltitude(){

    }



}
