package com.company.IFT;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Soda> sodaInventory = new ArrayList<>();
        sodaInventory.add(new Soda("Coke"));
        sodaInventory.add(new Soda("Pepsi"));
        sodaInventory.add(new Soda("Sprite"));
        sodaInventory.add(new Soda("Water"));

        Machine vendingMachine = new Machine(sodaInventory);

        System.out.println("|--------------------------|");
        System.out.println(vendingMachine.toString());
        System.out.println("|--------------------------|");
        System.out.println(vendingMachine.getSodaItemData("A",2));
        System.out.println(vendingMachine.getSodaItemCost("A",2));

        System.out.println(vendingMachine.getSodaCosts());


    }
}
