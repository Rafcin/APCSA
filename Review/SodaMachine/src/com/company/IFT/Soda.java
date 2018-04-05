package com.company.IFT;

/**
 * Created by rafaelszuminski on 11/9/17.
 */
public class Soda {

    private String mName;
    private double mPrice;

    private static int soadCount = 0;

    public Soda() {

        mName = "Ramen Pepsi Soda";
        mPrice = 0.99;
        soadCount++;
    }

    public String getmName() {
        return mName;
    }

    public double getmPrice() {
        return mPrice;
    }

    public static String getSoadCount() {
        return "There are "+ soadCount;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    public static void setSoadCount(int soadCount) {
        Soda.soadCount = soadCount;
    }

    public void buySoda(){
        soadCount--;

    }

    @Override
    public String toString() {
        return mName + "\t" + "$"+mPrice;
    }
}
