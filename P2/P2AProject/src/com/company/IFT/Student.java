package com.company.IFT;

/**
 * Created by rafaelszuminski on 9/26/17.
 */
public class Student {


    private String _FirstName;
    private String _LastName;

    private int _StudentID;
    private double _StudentGPA;
    private boolean _HasASB;
    private String _Bio;

    public Student() {
        super();
        _FirstName = "";
        _LastName = "";

        _StudentID = 0;
        _StudentGPA = 0;
        _HasASB = false;
        _Bio = "";
    }

    public Student(String fName, String lName, int sID, double sGPA, boolean ifASB, String info){
        _FirstName = fName;
        _LastName = lName;

        _StudentID = sID;
        _StudentGPA = sGPA;
        _HasASB = ifASB;
        _Bio = null;
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

    public String get_FirstName(){
        return _FirstName;
    }

    public String get_LastName(){
        return _LastName;
    }

    public String get_Bio(){
        return _Bio;
    }

    public int get_StudentID(){
        return _StudentID;
    }

    public double get_StudentGPA(){
        return _StudentGPA;
    }

    public boolean get_HasASB(){
        return _HasASB;
    }

    //-------------//

    public void set_FirstName(String fName){
        _FirstName = fName;
    }

    public  void set_LastName(String lName){
        _LastName = lName;
    }

    public void set_StudentID(int nId){
        _StudentID = nId;
    }

    public void set_StudentGPA(double nGPA){
        _StudentGPA = nGPA;
    }

    public void set_HasASB(boolean nASB){
        _HasASB = nASB;
    }

}
