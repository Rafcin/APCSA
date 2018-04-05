package com.company.IFT;

/**
 * Created by rafaelszuminski on 3/1/18.
 */

public class Student implements StudentInterface {

    String name;
    String grade;

    public Student (String sName, String sGrade){
        this.name = sName;
        this.grade = sGrade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGrade() {
        return grade;
    }

    @Override
    public void setGrade(String nGrade) {
        this.grade = nGrade;
    }

}
