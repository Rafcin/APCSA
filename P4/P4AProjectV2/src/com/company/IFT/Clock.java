package com.company.IFT;

import java.util.Arrays;

/**
 * Created by rafaelszuminski on 11/29/17.
 */
public class Clock {

    int Hour;
    int Min;
    int Sec;

    public Clock(int h, int m, int s){
        Hour = h;
        Min = m;
        Sec = s;
    }

    public int getMin() {
        return Min;
    }

    public int getSec() {
        return Sec;
    }

    public int getHour() {
        return Hour;
    }

    public String mostSeconds(Clock[] arr) {

        //1h = 3600 Sec
        //1m = 60s
        int arrSize = arr.length;
        int tempAry[] = new int[arrSize];
        int Index = 0;
        for(Clock c : arr){
            int tSec = c.getSec();
            int tMin = c.getMin()*60;
            int tHour = c.getHour()*3600;
            int sum = tHour+tMin+tSec;
            tempAry[Index] = sum ;
            Index++;
        }
        int max = maxValue(tempAry);
        return "Index: "+String.valueOf(getArrayIndex(tempAry,max))+" Time: "+max;
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
        return "Time: "+Hour+":"+Min+":"+Sec;

    }

}
