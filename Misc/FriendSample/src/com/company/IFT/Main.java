package com.company.IFT;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> friendsList = new ArrayList<>();

        friendsList.add("Ash");
        friendsList.add("Valk");
        friendsList.add("Jager");
        friendsList.add("Glaz");
        friendsList.add("Dokkaebi");
        friendsList.add("Vigil");
        friendsList.add("Ela");
        friendsList.add("Zofia");
        friendsList.add("Ying");
        friendsList.add("Mira");
        friendsList.add("Lesion");
        friendsList.add("Jackal");
        friendsList.add("Buck");
        friendsList.add("Blackbeard");
        friendsList.add("Blitz");
        friendsList.add("Bandit");
        friendsList.add("Echo");
        friendsList.add("Tachaka");
        friendsList.add("Fuze");
        friendsList.add("Doc");
        friendsList.add("Mute");
        friendsList.add("Frost");
        friendsList.add("Cavera");
        friendsList.add("Big Shaq");
        friendsList.add("Montagne");
        friendsList.add("Bikecle");

        System.out.println("S------------------S");
        System.out.println("List Size: "+friendsList.size());
        for(String s : friendsList){
            System.out.println(s);
        }
        System.out.println("------------------");
        for(Iterator<String> s = friendsList.iterator(); s.hasNext();){

        }
        System.out.println(friendsList.size());
        System.out.println("E------------------E");





    }
}
