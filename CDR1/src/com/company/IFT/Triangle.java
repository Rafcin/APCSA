package com.company.IFT;

/**
 * Created by rafaelszuminski on 2/5/18.
 */
public class Triangle extends ShapeGod {

    double width;
    double height;

    public Triangle (double w, double h) {
        width = w;
        height = h;
    }

    public double calcHypot(){
        return Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2));
    }

    public double getArea(){
        return 0.5*getHeight()*getWidth();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
