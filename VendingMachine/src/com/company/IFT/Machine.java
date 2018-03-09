package com.company.IFT;

import java.util.*;

/**
 * Created by rafaelszuminski on 12/18/17.
 */

public class Machine {

    ArrayList<Soda> sodas = new ArrayList<Soda>();
   //Map<Soda, Double> sodaMenu = new HashMap<Soda, Double>();
    HashMap sodaMenu = new HashMap();
    HashMap<String, Double> sodaCosts = new HashMap<String, Double>();


    public Machine(ArrayList<Soda> s){
        sodas = s;
        createSodaTypes();
        createSodaCosts();
    }

    public ArrayList<Soda> getSodas() {
        return sodas;
    }

    public Map<Soda, Double> getSodaMenu() {
        return sodaMenu;
    }

    public void createSodaTypes(){
        int Index = 1;
        for(Soda s : sodas){
            sodaMenu.put("A"+Index, s);
            Index++;
        }
    }

    public void createSodaCosts(){
        int Index = 1;
        for(Soda s : sodas){
            sodaCosts.put("A"+Index, (Random.randomNumber(0.5,1.0)));
            Index++;
        }
    }

    public Object getSodaItemData(String s, int I){
        return sodaMenu.get(s+I);
    }

    public Object getSodaItemCost(String s, int I){
        return sodaCosts.get(s+I);
    }

    public HashMap<String, Double> getSodaCosts(){
        return sodaCosts;
    }


    @Override
    public String toString() {
        return sodaMenu.keySet().toString();
    }
}
