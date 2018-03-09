package com.company.IFT;

/**
 * Created by rafaelszuminski on 10/31/17.
 */
public class ApLine {

    /**
     * Constructs APLine Obj with 3 dif user defined variables
     * @param A item A in the equation - coeficient of the X
     * @param B item B in the equation - coeficient of the Y
     * @param C item C in the equation - initger added to equation
     *
     * @param x -Coefficents of A or B
     * @param y -Coefficents of A or B
     *
     * @returns toString -- format of code to string
     *
     */

    private double mA;
    private double mB;
    private double mC;

    public ApLine (double A,double B,double C) {
        mA = A;
        mB = B;
        mC = C;
    }

    public double getSlope(){
        return(double)(-mA/mB);
    }

    public boolean isOnLine(int x,int y){
        if((mA*x)+(mB*y)+mC == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
