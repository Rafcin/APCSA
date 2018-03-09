package com.company.IFT;

import java.awt.*;

/**
 * Created by rafaelszuminski on 11/27/17.
 */

public class MyPod {

    String color = "";
    double memory;
    Song[] playlist = new Song[3];

    //You are stuck with these songs.
    //Stock Song A.
    Song songA = new Song("Vor í Vaglaskógi",3,5.0,true);
    //Stock Song B.
    Song songB = new Song("No Good",4,10.0,true);
    //Stock Song C.
    Song songC = new Song("Hot Blood",3,5.0,true);

    public MyPod () {

        color = "White";

        memory = 0;

        playlist[0] = songA;
        playlist[1] = songB;
        playlist[2] = songC;

    }

    public MyPod (String col, double M, Song a, Song b, Song c) {

        color = col;

        memory = M;

        playlist[0] = a;
        playlist[1] = b;
        playlist[2] = c;
    }

    public double getMemory() {
        return memory;
    }

    public String getColor() {
        return color;
    }

    public Song[] getPlaylist() {
        return playlist;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void setPlaylist(Song[] playlist) {
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return  "/**************************************/" + "\n"+
                "[My Pod Brainless User Interface]" + "\n" +
                "" + "\n"+
                "Color: " + color + "\n" +
                "Memory: " + memory + "GB" + "\n" +
                "Playlist: " + "\n" +
                "" + "\n"+
                "|----------------|" + "\n"+
                "|SongsList|" + "\n"+
                playlist[0].toString() + "\n" +
                "|----------------|" + "\n"+
                playlist[1].toString() + "\n" +
                "|----------------|" + "\n"+
                playlist[2].toString() + "\n" +
                "/**************************************/";




    }
}
