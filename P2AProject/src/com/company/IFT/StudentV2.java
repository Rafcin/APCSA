package com.company.IFT;

/**
 * Created by rafaelszuminski on 9/26/17.
 */
public class StudentV2 {
    private String _FirstName;
    private String _LastName;

    private int _StudentID;
    private double _StudentGPA;
    private boolean _HasASB;
    private String _Bio;

    public StudentV2() {
        super();
        _FirstName = "Cool";
        _LastName = "Senior";
        _StudentID = 12312;
        _StudentGPA = 4;
        _HasASB = true;
        _Bio = "Is cool";
    }

    @Override
    public String toString() {
        return  "-----[Student Info]----"+"\n"+
                "First Name: "+_FirstName+"\n"+
                "Last Name: "+_LastName+"\n"+
                "Student ID: "+_StudentID+"\n"+
                "Student GPA: "+_StudentGPA+"\n"+
                "ASB Status: "+_HasASB+"\n"+
                "Bio: "+_Bio+"\n"+
                "----------------------"+"\n";
    }

}
