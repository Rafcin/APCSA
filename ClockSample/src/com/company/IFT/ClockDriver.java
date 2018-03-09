package com.company.IFT;

/**
 * Created by rafaelszuminski on 10/16/17.
 */

public class ClockDriver {

    String clockName;

    private int hour;
    private int min;
    private int sec;

    public ClockDriver(String cName, int h,int m, int s){

        clockName = cName;

        hour = h;
        min = m;
        sec = s;

    }

    public ClockDriver(){

        clockName = "";
        hour = 12;
        min = 26;
        sec = 10;

    }

    @Override
    public String toString() {
        return "Time: "+hour+":"+min+":"+sec;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void setClockName(String clockName) {
        this.clockName = clockName;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
}
