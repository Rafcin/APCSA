package com.company.IFT;

import com.company.IFT.OS.Linux;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Linux linuxU = new Linux("Ubuntu","Kernel-4a71","Connect to Internet");
        System.out.println(linuxU);
        Linux linuxM = new Linux("Mint","Kernel-4a91","Shut Down");
        System.out.println(linuxM);
        Linux linuxK = new Linux("Kali","Kernel-4a91","Open CMD Promt");
        System.out.println(linuxK);
        Terminal term = Terminal.getInstance();
        term.open(0, 0, 700, 700);
    }


}
