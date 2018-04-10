package com.company.IFT;

/**
 * Created by rafaelszuminski on 4/9/18.
 */

public class DiverseArray
{
    /** Part (a): Complete method arraySum below
     */

    /** returns the sum of the entries in the one-dimensional array arr
     */

    public static int arraySum( int[] arr )
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    /** Part (b): Assume that arraySum works as specified regardless of what you wrote in part (a).
     * You must use arraySum appropriately to receive full credit.
     * Complete method rowSums below.
     */

    /** returns a one-dimensional array in which the entry at index k is the sum of
     * the entries of row k of the two dimensional array 2D
     */

    public static int[] rowSums( int[][] arr2D )
    {
        for(int r=0; r<arr2D.length; r++) {
            for (int c = 0; c < arr2D[r].length; c++) {
                return new int[] {arraySum(arr2D[r])};
            }
        }
        return null;
    }


    /** Part (c): Assume that arraySum and rowSums work as specified, regardless of what you wrote in parts (a) and (b).
     * You must use rowSums appropriately to receive credit.
     * Complete method isDiverse below.
     */

    /** returns true if all rows in arr2D have different row sums; false otherwise
     */

    public static boolean isDiverse( int[][] arr2D )
    {
        int[] sums = rowSums(arr2D);
        for(int first=0; first<sums.length; first++) {
            for(int second = first + 1;second < sums.length; second++ ){
                if(sums[first]==sums[second]){
                    return false;
                }
            }
        }
        return true;
    }
}

