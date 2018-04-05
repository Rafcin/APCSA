package com.company.IFT;

import javax.swing.*;

public class Main {

    public static ClockDriver kitchenClock;
    public static ClockDriver officeClock;

    public static void main(String[] args) {

        String h = JOptionPane.showInputDialog("Hours?");
        String m = JOptionPane.showInputDialog("Minutes?");
        String s = JOptionPane.showInputDialog("Seconds?");

        kitchenClock = new ClockDriver();
        officeClock = new ClockDriver("",parseIntToString(h),parseIntToString(m),parseIntToString(s));
        kitchenClock.toString();

        System.out.println("[S]----------------]");
        System.out.println("K: "+kitchenClock.toString());
        System.out.println("O: "+officeClock.toString());
        System.out.println("[E]----------------]");

        setTime(1,50,10);

        System.out.println("[S]----------------]");
        System.out.println("K: "+kitchenClock.toString());
        System.out.println("O: "+officeClock.toString());
        System.out.println("[E]----------------]");



    }

    public static Integer parseIntToString(String input){
        return Integer.parseInt(input);
    }

    public static void setTime(int h, int m,int s){
        officeClock.setClockName("");
        officeClock.setHour(h);
        officeClock.setMin(m);
        officeClock.setSec(s);
    }

    public static void convertDaylightSavings(int time){
        officeClock.setClockName("");
        officeClock.setHour(officeClock.getHour()+time);
        officeClock.setMin(officeClock.getHour()+time);
        officeClock.setSec(officeClock.getHour()+time);
    }

}
