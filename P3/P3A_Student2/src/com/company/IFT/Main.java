package com.company.IFT;

public class Main {

    static StudentDriver Raf = new StudentDriver();
    static UpdatedStudentDriver Joe = new UpdatedStudentDriver();


    public static void main(String[] args) {
        //Init

        //Set Data
        Raf.setmName("Raf");
        Raf.setGrades(4.00,3.19,3.00,2.45,1.56);
        printClassDataRaf();

        Joe.setmName("Joe");
        Joe.setGrades(4.00,4.00,3.50,4.00,4.00);
        printClassDataJoe();



        //Calc
    }

    public static void printClassDataRaf(){
        System.out.println(Raf);
    }
    public static void printClassDataJoe(){
        System.out.println(Joe);
    }

}
