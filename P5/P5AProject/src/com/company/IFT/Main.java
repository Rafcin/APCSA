package com.company.IFT;

import com.company.IFT.Heros.Ash;
import com.company.IFT.Heros.EdnaMode;
import com.company.IFT.Heros.MrIncredible;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        Ash ash = new Ash("Eliza Ash Cohen","Ash",true,3,"Watch for the blast!");
        ash.setAttackerOrDenfender(true);
        System.out.println(ash.superInfo());
        System.out.println(ash.toString());

        System.out.println("----------------------------------------------");

        MrIncredible incredible = new MrIncredible("Bob Parr","Mr Incredible",true,10000,"I work alone.");
        incredible.setHero(true);
        System.out.println(incredible.superInfo());
        System.out.println(incredible.toString());

        System.out.println("----------------------------------------------");

        EdnaMode edna = new EdnaMode("Edna Mode","Edna",false,false,"NO CAPES!");
        edna.setHero(true);
        System.out.println(edna.superInfo());
        System.out.println(edna.toString());
        edna.playSound();



    }


}
