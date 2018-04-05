package com.company.IFT;

/**
 * Created by rafaelszuminski on 11/27/17.
 */
public class Song {

    /*
    Vars
     */

    String title;
    //Seconds
    int duration;
    double price;
    boolean isFavorite;

    public Song () {
        title = "";
        duration = 0;
        price = 0.0;
        isFavorite = false;
    }

    public String convertSeconds(){

        int m;
        int s;

        m = duration/60;
        s = duration % 60;

        return m+":"+s;
    }

    public Song (String t, int d, double p, boolean f) {
        title = t;
        duration = d;
        price = p;
        isFavorite = f;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Duration: " + duration + "\n" +
                "Price: " + "$" + price + "\n" +
                "Is Favorite?: " + isFavorite;
    }
}
