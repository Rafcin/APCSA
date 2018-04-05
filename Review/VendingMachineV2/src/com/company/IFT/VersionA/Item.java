package com.company.IFT.VersionA;

/**
 * Created by rafaelszuminski on 12/19/17.
 */

public class Item {
    double price;
    private int stockAmt;
    private String itemType;

    //Create Item
    public Item(String itemN, double p, int s){
        this.price = p;
        this.stockAmt = s;
        this.itemType = itemN;
    }

    public String getItemType() {
        return itemType;
    }

    public double getPrice() {
        return price;
    }

    public int getStockAmt() {
        return stockAmt;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }


    public void setStockAmt(int stockAmt) {
        this.stockAmt = stockAmt;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
