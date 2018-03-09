package com.company.IFT;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by rafaelszuminski on 12/7/17.
 */
public class MyPod {

    Song mSong = new Song("Random Music",false);
    private ArrayList<Song> songList = new ArrayList<Song>();

    private String color;
    private int sizeGB;

    public MyPod(){
        color = "White";
        sizeGB = 8;
    }

    public MyPod(String c, int s){
        color = c;
        sizeGB = s;
        askOptions();
    }

    public void askOptions(){
        JFrame cFrame = new JFrame("Config");
        String songsInput = JOptionPane.showInputDialog(cFrame, "How many songs would you like to load?");
        for(int Index = 0; Index<Integer.parseInt(songsInput);Index++){
            JFrame mFrame = new JFrame("Music");
            String songsInfo = JOptionPane.showInputDialog(mFrame, "Enter Song Name");
            songList.add(new Song(songsInfo.toString(),false));
        }
    }

    @Override
    public String toString() {
        ArrayList<String> songs = new ArrayList<String>();
        for(Song s : songList){
            songs.add(s.getTitle());
        }

        return  "Color: "+color+"\n"+
                "Size: "+sizeGB+"\n"+
                "List Size: "+songList.size()+"\n"+
                "List: "+printSongs();



    }

    public String printSongs(){
        String result = "";
        for (Song s : this.songList){
            result += s.toString()+"\n";
        }
        return result;
    }
}
