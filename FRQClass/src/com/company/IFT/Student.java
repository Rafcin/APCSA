package com.company.IFT;

public class Student
{
    private String firstName;
    private String lastName;
    private int grade;
    private int numYearInc;

    public Student()
    {
        firstName = new String( "John" );
        lastName = new String( "Doe" );
        grade = 9;
        numYearInc = 1;
    } // end zero-arg constructor

    public Student( String initFirst, String initLast, int initGrade )
    {
        firstName = initFirst;
        lastName = initLast;
        grade = initGrade;
        numYearInc = 1;
    }

    /* incrementYear adds one year to a Student object's grade
     */
    public void incrementYear()
    {
        numYearInc++;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getGrade()
    {
        return grade;
    }

    public String toString()
    {
        return ( "Name: " + firstName + " " + lastName + "\t\t" +
                "Grade: " + grade + "\n" );
    }

} // end class Student

