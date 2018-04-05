package com.company.IFT;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> colleges = new ArrayList<>();
        ArrayList<String> removed = new ArrayList<>();


        colleges.add("MIT");
        colleges.add("UCI");
        colleges.add("CPSU");
        colleges.add("SBC");
        colleges.add("UCLA");
        colleges.add("UCSD");
        colleges.add("Harvard");

        for(String s : colleges){
            System.out.println(s);
        }
        System.out.println(colleges.size());
        System.out.println("|---------------------|");
        for(Iterator<String> itr = colleges.iterator(); itr.hasNext();)
        {
            String e = itr.next();
            if(e.length() == 4)
            {
                itr.remove();
            }
        }
//        for(String s : colleges){
//            if(s.length() >=4){
//                removed.add(s);
//                colleges.remove(s);
//            }
//        }
//        for(int I = 0; I<colleges.size(); I++ ){
//            if(colleges.toString().length() >= 4 ){
//                colleges.remove(I);
//            }
//        }
        for(String s : colleges){
            System.out.println(s);
        }
        System.out.println(colleges.size());




    }
}
