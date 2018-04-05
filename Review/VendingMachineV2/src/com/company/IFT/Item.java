package com.company.IFT;

/**
 * Created by rafaelszuminski on 12/20/17.
 */
public class Item {

    private String itemID;
    private double itemPrice;
    private String itemDescription;

    public Item(String Id, double p, String d){
        this.itemID = Id;
        this.itemPrice = p;
        this.itemDescription = d;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemID() {
        return itemID;
    }

    @Override
    public String toString() {
        return "Item: "+itemID+" $"+itemPrice+" "+itemDescription;
    }

}
