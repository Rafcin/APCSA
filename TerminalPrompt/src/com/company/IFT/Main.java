package com.company.IFT;

import jterm.JTerm;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new JFrame("Terminal");
        JTerm T = new JTerm();
        frame.add(JTerm.getTerminal());

    }


}
