package com.company.IFT;
import java.lang.*;

/**
 * Created by rafaelszuminski on 11/13/17.
 */

public class RightTriangle {

    private int base;
    private int height;

    public RightTriangle () {
        base = 0;
        height = 0;
    }

    public RightTriangle (int b, int h) {
        base = b;
        height = h;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calcHypotenuse (int B, int H) {
        int tempB = (int) Math.pow(B,2);
        int tempH = (int) Math.pow(H,2);
        return (int) Math.sqrt(tempH+tempB);
    }

    public int calcHypotV2 (int B, int H) {
        int tempLoc = (int) Math.hypot(B,H);
        return tempLoc;
    }

    public double calcAlpha () {
        if(base <=0 || height <= 0) {
            System.out.println("ERROR Base or Height is equal to 0");
        } else {
            return Math.toDegrees(Math.atan(height / base));
        }
        return 0;
    }

    public double calcArea () {
        double area = (base*height)/2;
        if(base <= 0 || height <= 0){
            System.out.println("Base and Height Are 0");
        } else {
            return area;
        }
        return 0;
    }

    @Override
    public String toString() {
        return  "Base: "+base+"\n"+
                "Height: "+height+"\n"+
                "Hypot: "+calcHypotenuse(base,height)+"\n"+
                "Deg: "+calcAlpha()+"\n"+
                "Area: "+calcArea()+"\n"+
                "Hypot2: "+calcHypotV2(base,height)+"\n";

    }
}
