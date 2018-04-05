package com.company.IFT;

import java.util.Arrays;

/**
 * Created by rafaelszuminski on 11/28/17.
 */

public class Student {

    String sFirstName;
    String sLastName;
    int sID;
    int GPA;

    public Student (String sFN, String sLN, int ID, int G) {

        sFirstName = sFN;
        sLastName = sLN;
        sID = ID;
        GPA = G;

    }

    public int getsID() {
        return sID;
    }

    public String getsFirstName() {
        return sFirstName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public int getGPA() {
        return GPA;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public String getGPAHighest(Student[] arr) {

        //1h = 3600 Sec
        //1m = 60s

        int tempAry[] = new int[arr.length];
        String[] tempName = new String[arr.length];

        int Index = 0;
        for(Student c : arr){
            tempAry[Index] = c.getGPA() ;
            tempName[Index] = c.getsFirstName();
            Index++;
        }
        int max = maxValue(tempAry);
        int indexB = getArrayIndex(tempAry,max);
        return "Name: "+tempName[indexB]+" Index: "+String.valueOf(getArrayIndex(tempAry,max))+" GPA: "+max;
    }

    public int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
        return k;
    }

    public int maxValue(int array[]){
        int max = Arrays.stream(array).max().getAsInt();
        return max;
    }

    @Override
    public String toString() {
        return "Name: "+getsFirstName()+" "+getsLastName()+"|"+" ID: "+getsID()+" GPA: " + GPA;
    }


}
