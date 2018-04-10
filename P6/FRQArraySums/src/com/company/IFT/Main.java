package com.company.IFT;

import java.util.Arrays;

public class Main {

    public static void main( String[] args )
    {
        /** testing out part (a) arraySum
         */

        int[] arr = {3,5,8,9};
        System.out.println( "Sum of array (should be 25): " + DiverseArray.arraySum( arr ) );

        /** declaring, filling, & printing arr2D in row-major order
         */

        int[][] arr2D = new int[5][3];
        for ( int r = 0; r < arr2D.length; r++ )
        {
            for ( int c = 0; c < arr2D[0].length; c++ )
            {
                arr2D[r][c] = (int)( Math.random() * 10 );
                System.out.print( arr2D[r][c] + "\t" );
            }
            System.out.println();
        }

        /** testing out part (b) rowSums
         */

        System.out.println( "Sum of each row: " + Arrays.toString( DiverseArray.rowSums( arr2D ) ) );

        /** testing out part (c) isDiverse
         */

        System.out.println( "Is it diverse? " + DiverseArray.isDiverse( arr2D ) );
    }

}
