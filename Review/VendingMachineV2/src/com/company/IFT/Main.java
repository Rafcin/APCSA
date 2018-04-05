package com.company.IFT;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {

        final ImageIcon icon = new ImageIcon(new URL("https://image.flaticon.com/icons/png/128/362/362289.png"));

        UIManager UI= new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(61, 61, 61));
        UI.put("Panel.background",new ColorUIResource(61, 61, 61));
        UI.put("OptionPane.informationIcon",icon);
        UI.put("OptionPane.font", new Font("Arial Black", Font.BOLD, 30));
        UI.put("OptionPane.messageForeground", Color.WHITE);

        Machine machine = new Machine();
        machine.addItem(new Item("Cola",1.50,"ColaCo"));
        machine.addItem(new Item("Sprite",1.25,"SpriteCo"));
        machine.addItem(new Item("Pepsi",0.50,"PepsiCo"));
        System.out.println(machine.toString());

        JOptionPane.showMessageDialog(null, machine.toString());

        String itemInput = (JOptionPane.showInputDialog(null, "What item would you like?"));
        double walletInput = Double.parseDouble(JOptionPane.showInputDialog(null, "How much money would you like to use?"));
        machine.dispenseItem(itemInput,walletInput);

        System.out.println(machine.toString());
        System.exit(0);



    }
}
