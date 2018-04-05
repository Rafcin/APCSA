package com.company.IFT;

import static com.company.IFT.StudentDriver.classTypes.*;

/**
 * Created by rafaelszuminski on 10/24/17.
 */
public class UpdatedStudentDriver {

    private static String mName = "";


    double[] grades = new double[5];

    public UpdatedStudentDriver(){
        English.setGrade(0.00);
        Math.setGrade(0.00);
        Science.setGrade(0.00);
        CTE.setGrade(0.00);
        History.setGrade(0.00);
    }

    public UpdatedStudentDriver(double E, double M, double S, double C, double H){
        English.setGrade(E);
        Math.setGrade(M);
        Science.setGrade(S);
        CTE.setGrade(C);
        History.setGrade(H);
    }

    public enum gradeTypes {
        A,B,C,D,F;
    }

    /**
     * Scale for Grades:
     * A = 4.00
     * A- = 3.70
     * B+ = 3.30
     * B = 3.00
     * B- = 2.70
     */

    public enum classTypes{


        English(0.00),Math(0.00),Science(0.00),CTE(0.00),History(0.00);

        private double grade;

        classTypes(double i) {
            this.grade = i;
        }

        public double grade(){
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }
    }

    public static void setGrades(double E,double M, double S, double C, double H){
        English.setGrade(E);
        Math.setGrade(M);
        Science.setGrade(S);
        CTE.setGrade(C);
        History.setGrade(H);
    }

    public static double calcGPA(){
        double addAll =  English.getGrade()+Math.getGrade()+Science.getGrade()+CTE.getGrade()+History.getGrade();
        return addAll/5;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmName() {
        return mName;
    }

    public String returnGrade(){
        double gpa = calcGPA();
        if(gpa>=4.0){
            return "A";
        }else if(gpa>=3.0&&gpa<4.0){
            return "B";
        }else if(gpa>=2.0&&gpa<3.0){
            return "C";
        }else if(gpa>=1.0&&gpa<2.0){
            return "D";
        }else if(gpa<=1.0){
            return "F";
        }
        return null;
    }

    @Override
    public String toString() {
        return "-----------------------"+"\n"+
                "Name: "+mName+"\n"+
                "English: "+English.getGrade()+"\n"+
                "Math: "+Math.getGrade()+"\n"+
                "Science: "+Science.getGrade()+"\n"+
                "CTE: "+CTE.getGrade()+"\n"+
                "History: "+History.getGrade()+"\n"+
                "-----------------------"+"\n"+
                "Grade: "+returnGrade()+"\n"+
                "GPA: "+calcGPA()+"\n";

    }
}
