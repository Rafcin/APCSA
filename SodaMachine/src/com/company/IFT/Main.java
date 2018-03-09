package com.company.IFT;

public class Main{

    public static void main(String[] args) {

        System.out.println(Soda.getSoadCount());
        System.out.println("Filling the machine...");

        Soda[] Inventory = new Soda[10];


        System.out.println("---------------------------");
        int SodaI = 0;
        for(Soda sodas : Inventory){
            SodaI++;
            if(SodaI < Inventory.length) {
                Inventory[SodaI] = new Soda();
                System.out.println(SodaI+"|"+Inventory[SodaI]+"|");
            }
        }
        System.out.println("---------------------------");

    }
}
