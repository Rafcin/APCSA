package com.company.IFT;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {

    static ArrayList<String> dataBaseName;
    static ArrayList<String> dataBasePass;
    static String tempUsername;
    static String tempPass;

    public static void main(String[] args) {

        dataBaseName = new ArrayList<String>();
        dataBasePass = new ArrayList<String>();

        ArrayList<String> dataBase = new ArrayList<String>();


        //[LoginA]//
        dataBaseName.add("admin");
        dataBasePass.add("root");

        createDataMenu("Enter Website","Username");

    }

    public static void createDataMenu(String btnName, String question){
        final JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        final JButton clickMeButton = new JButton(btnName);
        clickMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(question);
                tempUsername = name;
                if(dataBaseName.contains(tempUsername)){
                    JOptionPane.showMessageDialog(frame, "Accepted: " + tempUsername);
                    String pass = JOptionPane.showInputDialog("Password");
                    tempPass = pass;
                    if(dataBasePass.contains(tempPass)){
                        JOptionPane.showMessageDialog(frame, "Accepted Pass: " + tempPass);
                        JOptionPane.showMessageDialog(frame, "Welcome Admin");
                    }else{
                        JOptionPane.showMessageDialog(frame, "Denied Pass: " + tempPass);
                    }

                }else{
                    JOptionPane.showMessageDialog(frame, "Denied: " + tempUsername);
                }


            }
        });

        frame.getContentPane().add(clickMeButton);
        frame.pack();

        frame.setVisible(true);
    }




}
