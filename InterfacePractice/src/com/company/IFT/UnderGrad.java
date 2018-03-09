package com.company.IFT;

/**
 * Created by rafaelszuminski on 3/1/18.
 */
public class UnderGrad extends Student {

    public UnderGrad(String sName, String sGrade) {
        super(sName, sGrade);
        System.out.println(this.getClass().getSimpleName()+" Name:"+getName());
    }

}
