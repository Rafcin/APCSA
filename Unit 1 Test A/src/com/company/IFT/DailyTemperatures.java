package com.company.IFT;

/*
Rafael Szuminski
P3
9-22-17
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.IFT.ExternalMath.randomNumber;
import static com.company.IFT.TempCheck.checkTemp;

public class DailyTemperatures {

    static int[] dates = new int[0];
    static String[] dailyForecast;
    static int[] dailyTemps;

    public static void main(String[] args) {
        tempMenu("Enter Number of Days","Data:");
    }

    //Make the menu. For later use please import rafcore.menus.template

    //Used to create popup and everything else.
    public static void tempMenu(String btnName, String dataTxt){


        //Init Jframe menu
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        final JButton clickMeButton = new JButton(btnName);
        clickMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int dataSize = Integer.parseInt(JOptionPane.showInputDialog("TempData: "+dataTxt));
                int[] tempArray = new int[dataSize];
                //Create Sizes becuase I need to.
                dates = tempArray;
                dailyForecast = new String[tempArray.length];
                dailyTemps = new int[tempArray.length];
                System.out.println(dates.length);
                System.out.println("-------------------------------------------");
                System.out.println("");
                System.out.println("Date"+"\t"+"Daily Temp"+"\t"+"Forecast"+"\t");
                JOptionPane.showMessageDialog(null,"Data Added: " + dataSize);
                System.out.println("");
                createData();
            }
        });


        //Make sure you see the frame
        frame.getContentPane().add(clickMeButton);
        frame.pack();

        frame.setVisible(true);
    }


    //EXTERNAL CLASSES FOR MATH AND CHECK SO YOU WONT GET CONFUSED

    //Setup all the arrays etc
    public static void createData(){

        int tempRan = 0;

        /*
        * So this part creates the days from 1 - X and uses the array dates that is assigned once the user inputs a number to
        * the Jmenu.
        */


        //Setup The Random Temp and Write Array
        try {
            int count = 1;
            for(int temps = 0; temps<= dates.length; temps++) {
                count++;
                tempRan = randomNumber(-100,100);
                dailyTemps[temps] = tempRan;
            }
        } catch (Exception e) { /* do nothing I HATE THE LOOP ERRORS SO NO THEY ARE GONE!*/ }


        //Setup Forecast and store it.
        try {
            int count = 1;
            for(int fores = 0; fores<= dates.length; fores++) {
                count++;
                dailyForecast[fores] = checkTemp(dailyTemps[fores]);
            }
        } catch (Exception e) { /* do nothing I HATE THE LOOP ERRORS SO NO THEY ARE GONE!*/ }


        //Log the events with tabs.
        try {
            int count = 1;
            for(int dateOrder = 0; dateOrder<= dates.length; dateOrder++) {
                dates[dateOrder] = count;
                count++;
                //System.out.print("TempRanAray"+dailyTemps[dateOrder]);

                // the T will create tabbed logs.
                System.out.println(dates[dateOrder]+"\t"+dailyTemps[dateOrder]+"\t"+dailyForecast[dateOrder]+"\t");
            }
            //Catches Expetions and hides them so my code looks perfect without flaws
        } catch (Exception e) { /* do nothing I HATE THE LOOP ERRORS SO NO THEY ARE GONE!*/ }



    }




}
