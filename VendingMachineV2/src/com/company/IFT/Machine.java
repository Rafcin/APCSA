package com.company.IFT;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by rafaelszuminski on 12/20/17.
 */

//Items
public class Machine extends ArrayList<Item> {

    //Item Ids
    ArrayList<String> ids = new ArrayList<String>();
    JFrame jFrame = new JFrame("Vending Machine");

    public Machine(){

    }

    public void addItem(Item item) throws Exception {
        if(item == null) {
            throw new Exception("Item can not be null");
        }
        if(item.getItemPrice() <= 0 ){
            throw new Exception("Can not be 0 or lower");
        }
        for(String itemID : ids){
            if(itemID.equalsIgnoreCase(item.getItemID())){
                throw new Exception("Item duplicate");
            }
        }
            this.add(item);
            ids.add(item.getItemID());
    }

    public void removeItem(String itemID){
        for(int i = 0 ; i<ids.size(); i++){
            //CHECK IF ARY LIST CONTAINS ITEM AND THEN REMOVE IT.
            if(ids.contains(itemID)) {
                this.remove(i);
                ids.remove(i);
            }
        }
    }

    public void dispenseItem(String id, double money) throws Exception {
        if(ids.contains(id)) {
            if(money > 0){
                double itemPrice = this.get(ids.indexOf(id)).getItemPrice();
                JOptionPane.showMessageDialog(jFrame,"Item Cost: $"+itemPrice);
                int reply = JOptionPane.showConfirmDialog(jFrame, "Confirm Purchase?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if(money >= itemPrice) {
                    if (reply == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(jFrame, "Dispensing Item and Calculating Change");
                        money = money - itemPrice;

                        int dollars = (int) Math.floor(money / 1);
                        money -= dollars * 1;

                        int quarters = (int) Math.floor(money / 0.25);
                        money -= quarters * 0.25;

                        int dimes = (int) Math.floor(money / 0.10);
                        money -= dimes * 0.10;

                        int nickels = (int) Math.floor(money / 0.05);
                        money -= nickels * 0.05;

                        int pennies = (int) Math.round(money * 100);

                        JOptionPane.showMessageDialog(jFrame, "Change due: " + "Dollars: " + dollars + " \nQuarters: " + quarters + " \nDimes: " + dimes + " \nNickels: " + nickels + " \nPennies: " + pennies);
                        removeItem(id);
                    }else {
                        JOptionPane.showMessageDialog(jFrame, "Goodbye...");
                        System.exit(0);
                    }
                }else{
                    JOptionPane.showMessageDialog(jFrame, "Not Enough Money Goodbye...");
                    System.exit(0);
                }

            }

        }
    }

    @Override
    public String toString() {
        return Arrays.toString(ids.toArray());
    }

    @Override
    public Item get(int index) {
        return super.get(index);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
