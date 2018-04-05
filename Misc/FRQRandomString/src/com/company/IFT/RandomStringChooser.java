package com.company.IFT;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafaelszuminski on 2/21/18.
 */

public class RandomStringChooser {
    private List<String> strings;
    public RandomStringChooser(String[] stringArray){
        strings = new ArrayList<String>();
        for(String s : stringArray){
            strings.add(s);
        }
    }
    public String getNext(){
        if(strings.size()>0){
            return strings.remove((int)(Math.random()*strings.size()));
        }
        return "NONE";
    }
}
