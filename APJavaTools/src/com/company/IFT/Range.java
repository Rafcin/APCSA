package com.company.IFT;

import com.company.IFT.Contains.Contains;

import java.util.Arrays;

/**
 * Created by rafaelszuminski on 3/1/18.
 */
public class Range implements Contains{

    int[] newArrayRange;
    public Range(int Min, int Max){
        int ammount = 0;
        for(int i = Min; i<=Max;i++){
            System.out.println(i);
            ammount = i;
        }
        int[] RangeArray = new int[ammount];
        int minm = Min;
        for(int i = 0; i<=RangeArray.length-1; i++){
            RangeArray[i] = minm;
            minm++;
        }
        newArrayRange = RangeArray;
    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public boolean contains(int x) {
        return Arrays.asList(newArrayRange).contains(x);
    }
}
