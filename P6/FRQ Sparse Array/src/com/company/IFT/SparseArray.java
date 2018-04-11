package com.company.IFT;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafaelszuminski on 4/10/18.
 */

public class SparseArray
{
    /** The number of rows and columns in the sparse array */
    private int numRows;
    private int numCols;

    /** The list of entries representing the non-zero elements of the sparse array.
     *  Entries are stored in the list in no particular order.
     *  Each non-zero element is represented by exactly one entry in the list.
     */
    private List<SparseArrayEntry> entries;

    /** Constructs an empty SparseArray */
    public SparseArray()
    {  entries = new ArrayList<SparseArrayEntry>(); }

    /** Mrs. Q created this method to add entries */
    public void addEntry( SparseArrayEntry num )
    {
        entries.add( num );
        if ( num.getRow() > numRows )
        {
            numRows = num.getRow()+1;
        }
        if ( num.getCol() > numCols )
        {
            numCols = num.getCol()+1;
        }
    }

    /** Returns the number of rows in the sparse array. */
    public int getNumRows()
    {   return numRows;   }

    /** Returns the number of rows in the sparse array. */
    public int getNumCols()
    {   return numCols;   }

    /** Returns the value of the element at row index row and column index col in the sparse array
     *  Precondition: 0 <= row < getNumRows()
     *                0 <= col < getNumCols()
     */
    public int getValueAt( int row, int col )
    {
        for(SparseArrayEntry obj : entries){
            if(sanityCheck(obj.getRow(),row) && sanityCheck(obj.getCol(),col)){
                return obj.getValue();
            }
        }

        return 0;
        //I tried null, bad idea...
    }

    public boolean sanityCheck(int objectA, int objectB){
        if(objectA == objectB){
            return true;
        }else{
            return false;
        }
    }

    /** Removes the column col from the sparse array
     *  Precondition: 0 <= col < getNumCols()
     */
    public void removeColumn(int col) {

        int i = 0;
        while (i < entries.size()) {
            if (sanityCheck(entries.get(i).getCol(),col)) {
                entries.remove(i);
            } else {
                i++;
            }
        }

        i = 0;
        //Not the most efficent method but it works
        ArrayList<SparseArrayEntry> newSArray = new ArrayList<SparseArrayEntry>();
        while (i < entries.size()) {
            SparseArrayEntry item = entries.get(i);
            if (item.getCol() > col) {
                newSArray.add(new SparseArrayEntry(item.getRow(), item.getCol()-1, item.getValue()));
                entries.remove(i);
            } else
                i++;
        }
        for (SparseArrayEntry item: newSArray)
            entries.add(item);
        numCols--;
    }

    /** Mrs. Q created this toString method */
    public String toString()
    {
        String output = new String();
        for ( SparseArrayEntry entry : entries )
        {
            output += entry;
        }
        return output;
    }
    // There may be instance variables, constructors, and methods that are not shown.
}

