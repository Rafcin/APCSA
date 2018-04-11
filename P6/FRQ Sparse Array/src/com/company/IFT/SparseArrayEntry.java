package com.company.IFT;

/**
 * Created by rafaelszuminski on 4/10/18.
 */

public class SparseArrayEntry
{
    /** The row index and column index for this entry in the sparse array */
    private int row;
    private int col;

    /** The value of this entry in the sparse array */
    private int value;

    /** Constructs a SparseArrayEntry that represents a sparse array element
     * with row index r and column index c, containing value v.
     */

    public SparseArrayEntry( int r, int c, int v )
    {
        row = r;
        col = c;
        value = v;
    }

    /** returns the row index of this sparse array element */
    public int getRow()
    {   return row;   }

    /** returns the column index of this sparse array element */
    public int getCol()
    {   return col;   }

    /** returns the value of this sparse array element */
    public int getValue()
    {   return value;   }

    /** Mrs. Q created this toString method */
    public String toString()
    {
        return "row:\t" + row + "\ncol:\t" + col + "\nvalue:\t" + value + "\n\n";
    }
}

