package com.company.IFT;

/**
 * Created by rafaelszuminski on 2/14/18.
 */
public class Salad implements MenuItem {
    public String mName;
    public double mPrice;

    @Override
    public String getName() {
        return getmName();
    }

    @Override
    public double getPrice() {
        return getmPrice();
    }

    public double getmPrice() {
        return mPrice;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    @Override
    public String toString() {
        return getName();
    }
}
