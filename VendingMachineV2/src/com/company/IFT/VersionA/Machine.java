package com.company.IFT.VersionA;

import com.company.IFT.VersionA.Item;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by rafaelszuminski on 12/19/17.
 */

public class Machine {

    JFrame jFrame = new JFrame("Vending Machine");
    ArrayList<Item> stock = new ArrayList<Item>();
    HashMap<Integer, String> vendingMenu = new HashMap<Integer, String>();
    ArrayList<Item> trash = new ArrayList<Item>();

    public Machine(ArrayList<Item> items){
        stock = items;
        int Index = 1;
        for(Item sItem : stock){
            vendingMenu.put(Index, sItem.getItemType());
            Index++;
        }

    }

    public void buyItem(){
        int IndexOfItem = Integer.parseInt(JOptionPane.showInputDialog(jFrame, "What Item Would You Like?"));
            int stockVal = 0;
            double stockPrice = 0.0;
            String stockName = "";
            for(Item sI : stock){
                if(vendingMenu.get(IndexOfItem).equals(sI.getItemType())){
                    stockVal = sI.getStockAmt();
                    stockName = sI.getItemType();
                    stockPrice = sI.getPrice();
                }
            }
            if(vendingMenu.get(IndexOfItem).equals(stockName)){
                JOptionPane.showMessageDialog(jFrame,"Item Cost: $"+stockPrice);
                //Buy Stuff
                int reply = JOptionPane.showConfirmDialog(null, "Confirm Purchase?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Dispensing Item");
                    //Calc Change



                    //Remove Item Purchases
                    for(int i = 0; i < stock.size(); i++) {
                        if(stock.get(i).getPrice() == stockPrice) {
                            stock.remove(stock.get(i));
                        }
                    }
                    //Then Exit
                }
                else {
                    JOptionPane.showMessageDialog(null, "Goodbye...");
                    System.exit(0);
                }
            }else {
                JOptionPane.showMessageDialog(jFrame, "Item Does Not Exist");
            }
        }




    @Override
    public String toString() {
        return stock.toString();
    }
}

