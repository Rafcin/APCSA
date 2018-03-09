package com.company.IFT;

import java.util.ArrayList;

/**
 * Created by rafaelszuminski on 9/27/17.
 */
public class HumanDriver {

    private String _Name;

    private String _Emotion;

    private boolean _isAlive;

    private int _age;


    public HumanDriver() {
        _Emotion = "Sad";
        _Name = "Joe";
        _isAlive = false;
        _age = 0;

    }

    public HumanDriver(String name, String emot, boolean alive, int age){
        _Name = name;
        _Emotion = emot;
        _isAlive = alive;
        _age = age;
    }



    @Override
    public String toString() {
        return  "------------------" + "\n" +
                "Name: "+_Name+"\n"+
                "Emotion: "+_Emotion+"\n"+
                "Age: "+_age+"\n"+
                "Alive?: "+_isAlive+"\n";

    }

}
