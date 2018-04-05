package com.company.IFT;

/**
 * Created by rafaelszuminski on 2/14/18.
 */
public class Sandwich implements MenuItem {

    public String sandwichName;
    public double sandwichPrice;

    @Override
    public String getName() {
        return getSandwichName();
    }

    @Override
    public double getPrice() {
        return getSandwichPrice();
    }

    public double getSandwichPrice() {
        return sandwichPrice;
    }

    public String getSandwichName() {
        return sandwichName;
    }

    public void setSandwichName(String sandwichName) {
        this.sandwichName = sandwichName;
    }

    public void setSandwichPrice(double sandwichPrice) {
        this.sandwichPrice = sandwichPrice;
    }

    @Override
    public String toString() {
        return getName();
    }
}
