package com.company.IFT;

public class Main {

    public static void main(String[] args) {


        //Songs For Custom Pod
        Song customA = new Song("Seeing Red",5,3.4,true);
        Song customB = new Song("Burning Man",4,3.4,true);
        Song customC = new Song("Flowers in Your Hair",4,5.0,false);


        //Create Pods
        MyPod myPod = new MyPod();
        MyPod workPod = new MyPod("Red",64,customA,customB,customC);


        //Prints
        //System.out.println(myPod);
        //System.out.println(workPod);



    }
}
