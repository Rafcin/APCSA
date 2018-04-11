package com.company.IFT;

public class Main {

    public static void main( String[] args )
    {
        SparseArray sparse = new SparseArray();
        sparse.addEntry( new SparseArrayEntry( 1, 1, 5 ) );
        sparse.addEntry( new SparseArrayEntry( 1, 4, 4 ) );
        sparse.addEntry( new SparseArrayEntry( 2, 0, 1 ) );
        sparse.addEntry( new SparseArrayEntry( 3, 1, -9 ) );

        System.out.print( sparse );
        System.out.println( "Number of Rows: " + sparse.getNumRows() );
        System.out.println( "Number of Columns: " + sparse.getNumCols() + "\n" );

        System.out.println( "Value at R3C1: " + sparse.getValueAt(3,1) );
        System.out.println( "Value at R3C3: " + sparse.getValueAt(3,3) + "\n");

        System.out.println( "Removing any entries in column 1..." );
        sparse.removeColumn(1);
        System.out.print( sparse );
        System.out.println( "Number of Rows: " + sparse.getNumRows() );
        System.out.println( "Number of Columns: " + sparse.getNumCols() + "\n" );
    }

}
