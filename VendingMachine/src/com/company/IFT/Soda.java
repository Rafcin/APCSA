package com.company.IFT;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by rafaelszuminski on 12/18/17.
 */

public class Soda {

    private String sodaType;

    public Soda(String sType){
        sodaType = sType;

    }

    public String getSodaType() {
        return sodaType;
    }

    public void setSodaType(String sodaType) {
        this.sodaType = sodaType;
    }

    @Override
    public String toString() {
        return sodaType;
    }
}
