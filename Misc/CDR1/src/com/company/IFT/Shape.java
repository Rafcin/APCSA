package com.company.IFT;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Enumeration;

/**
 * Created by rafaelszuminski on 1/31/18.
 */
public class Shape {

    private String id;
    private String color;
    private double width;
    private double height;
    private double diameter;

    /*
    a.	an instance variable for its type (i.e. circle, square, rectangle, right triangle), dimensions (i.e. radius/diameter, base/height in integers), its color
    b.	a zero-argument which defaults the shape to a red square with a base and height of 5
    c.	a four-argument constructor to initialize appropriate instance variables (i.e. if the shape is a circle, the set the radius and diameter, but if it’s something else, set the base and height)
    d.	getter methods for all instance variables,
    e.	setter methods for all instance variables,
    f.	calcHypotenuse() - a method that returns a double which calculates the hypotenuse of a right triangle
    g.	calcArea()- a method that returns a double which calculates the area of the appropriate shape (i.e. if the shape is a circle, it usesA=r2)
    h.	calcPerimeter() - a method that returns a double which calculates the perimeter of the appropriate shape
    i.	 toString() - method that prints the output like the sample to the right: *Reffer to Doc*
     */


    public Shape (){
        id = "Square";
        color = "Red";
        width = 5.0;
        height = 5.0;
        diameter = 0;

    }

    public Shape(String sId, String sColor, double sWidth, double sHeight, double sDiameter){
        this.id = sId;
        this.color = sColor;
        this.width = sWidth;
        this.height = sHeight;
        this.diameter = sDiameter;

    }

    public double getDiameter() {
        return diameter;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        //A=PI*r^2\\
        //R\\
        if(id == "Circle" || id == "circle"){
            double r = getDiameter()/2;
            return Math.PI*(Math.sqrt(r));
        }else if (id == "Triangle" || id == "triangle"){
            return 0.5*getHeight()*getWidth();
        }else{
            return getWidth()*getHeight();
        }

    }

    public String getId() {
        return id;
    }

    public double calcHypot(){
        return Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2));
    }

    public double calcPerimiter(){
        if(id == "Circle" || id == "circle"){
            return Math.PI*diameter;
        }else if(id == "Triangle" || id == "triangle"){
            return getHeight() + getWidth() + calcHypot();
        }else{
            return 2 * (getWidth() + getHeight());
        }
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String toString( ){
        return "[I am a "+getId()+"]"+" With a color of: "+getColor()+"\n" +
                 "Area ["+round(getArea(),3)+"]"+"\n"+
                 "Hypot ["+round(calcHypot(),3)+"]"+" "+"\n"+
                 "Perimeter ["+round(calcPerimiter(),3)+"]";
    }


}
