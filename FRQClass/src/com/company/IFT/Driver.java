package com.company.IFT;

public class Driver
{
    public static void main( String[] args )
    {
        ClassRoster mrsQsClass = new ClassRoster();
        mrsQsClass.addStudent( new Student( "Nick", "Amirov", 12 ) );
        mrsQsClass.addStudent( new Student( "Kaylie", "Bair", 12 ) );
        mrsQsClass.addStudent( new Student( "Jack", "Bybel", 12 ) );
        mrsQsClass.addStudent( new Student( "Chris", "Cross", 12 ) );
        mrsQsClass.addStudent( new Student( "Dawson", "Do", 12 ) );
        mrsQsClass.addStudent( new Student( "Damian", "Gullo", 11 ) );
        mrsQsClass.addStudent( new Student( "Quinton", "Kinnie", 12 ) );
        mrsQsClass.addStudent( new Student( "Kyle", "Kosmos", 12 ) );
        mrsQsClass.addStudent( new Student( "Nolan", "Liston", 12 ) );
        mrsQsClass.addStudent( new Student( "Felix", "Murray", 12 ) );
        mrsQsClass.addStudent( new Student( "Tyler", "Nguyen", 12 ) );
        mrsQsClass.addStudent( new Student( "Dennis", "Santoso", 11 ) );
        mrsQsClass.addStudent( new Student( "Nick", "Stroh", 11 ) );
        mrsQsClass.addStudent( new Student( "Raf", "Szuminski", 11 ) );
        mrsQsClass.addStudent( new Student( "Joe", "Taczy", 11 ) );
        mrsQsClass.addStudent( new Student( "Grant", "Walters", 12 ) );
        mrsQsClass.addStudent( new Student( "Filip", "Weber", 12 ) );
        mrsQsClass.addStudent( new Student( "Tim", "Won", 12 ) );
        mrsQsClass.addStudent( new Student( "Leona", "Wong", 11 ) );
        mrsQsClass.addStudent( new Student( "Victor", "Wongsatjachock", 11 ) );

        System.out.println( "Initial Roster: " );
        System.out.println( mrsQsClass );

        mrsQsClass.dropStudent( "Gullo" );

        System.out.println( "New Roster: " );
        System.out.println( mrsQsClass );

        mrsQsClass.newYear();
        System.out.println( "Still at LHHS in 2018-2019: " );
        System.out.println( mrsQsClass );
    }

} // end class
