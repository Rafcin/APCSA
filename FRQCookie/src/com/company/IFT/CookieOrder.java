package com.company.IFT;

/**
 * Created by rafaelszuminski on 3/8/18.
 */

public class CookieOrder {

    public String cookieBoxName;
    public int ammountOfCookieBoxes;

    public CookieOrder(String trefoils, int i) {
        cookieBoxName = trefoils;
        ammountOfCookieBoxes = i;
    }

    public String getVariety(){
        return getCookieBoxName();
    }

    public int getNumBoxes(){
        return getAmmountOfCookieBoxes();
    }

    public int getAmmountOfCookieBoxes() {
        return ammountOfCookieBoxes;
    }

    public String getCookieBoxName() {
        return cookieBoxName;
    }

    public void setAmmountOfCookieBoxes(int ammountOfCookieBoxes) {
        this.ammountOfCookieBoxes = ammountOfCookieBoxes;
    }

    public void setCookieBoxName(String cookieBoxName) {
        this.cookieBoxName = cookieBoxName;
    }

}
