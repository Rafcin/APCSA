package com.company.IFT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 * Created by rafaelszuminski on 11/28/17.
 */
public class Roster extends ArrayList {


    //Can Store 3 Clock Items
    public static Student studentsRoster[] = new Student[3];

    public Roster(){

        //H:M:S\\
        studentsRoster[0] = new Student("Mike","Skeet",110,4);
        studentsRoster[1] = new Student("Joe","Wheezer",610,2);
        studentsRoster[2] = new Student("Bob","Zark",310,3);

    }


    @Override
    public String toString() {
        Student[] tempStudents = new Student[studentsRoster.length];
        String tempStudentCalc = new String();

        int Index = 0;
        for(Student c : studentsRoster){
            tempStudents[Index] = c;
            Index++;
        }
        int IndexA = 0;
        for(Student c : studentsRoster){
            tempStudentCalc = c.getGPAHighest(studentsRoster);
            IndexA++;
        }
        return  "|--Students--|"+"\n"+
                Arrays.toString(tempStudents)+"\n"+
                tempStudentCalc;


    }

}
