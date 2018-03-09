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
    boolean isFavorite;

    public Song() {
        title = "";
        isFavorite = false;
    }

    public Song(String t, boolean f) {
        title = t;
        isFavorite = false;
    }



    public String getTitle() {
        return title;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }



    public void setTitle(String title) {
        this.title = title;
    }





    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Is Favorite?: " + isFavorite;
    }
}
