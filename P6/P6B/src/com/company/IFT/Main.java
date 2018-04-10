package com.company.IFT;

public class Main {

    public static void main(String[] args) {
        int[][] fill = new int[3][5];

        //filling the array
        //printing the array out
        int counter = 1;
        int chartSum = 0;
        int row1Sum = 0;
        int row2Sum = 0;
        int row3Sum = 0;
        int column1Sum = 0;
        int column2Sum = 0;
        int column3Sum = 0;
        int column4Sum = 0;
        int column5Sum = 0;
        for (int r = 0; r < fill.length; r++)
        {
            for (int c = 0; c < fill[0].length; c++)
            {
                fill[r][c] = counter;
                counter++;
                chartSum += fill[r][c];
                System.out.print(fill[r][c] + "\t");
            }
            System.out.println();
        }
        //finding row sum
        for (int c = 0; c < fill[0].length; c++)
        {
            row1Sum += fill[0][c];
        }
        for (int c = 0; c < fill[0].length; c++)
        {
            row2Sum += fill[1][c];
        }
        for (int c = 0; c < fill[0].length; c++)
        {
            row3Sum += fill[2][c];
        }
        //finding column sum
        for (int r = 0; r < fill.length; r++)
        {
            column1Sum += fill[r][0];
        }
        for (int r = 0; r < fill.length; r++)
        {
            column2Sum += fill[r][1];
        }
        for (int r = 0; r < fill.length; r++)
        {
            column3Sum += fill[r][2];
        }
        for (int r = 0; r < fill.length; r++)
        {
            column4Sum += fill[r][3];
        }
        for (int r = 0; r < fill.length; r++)
        {
            column5Sum += fill[r][4];
        }


        System.out.println("\n" + "Sum of array: " + chartSum + "\n" + "Sum of 1st row: " + row1Sum + "\n" +
                "Sum of 2nd row: " + row2Sum + "\n" + "Sum of 3nd row: " + row3Sum + "\n" + "Sum of 1st column: "
                + column1Sum + "\n" + "Sum of 2nd Column: " + column2Sum + "\n" + "Sum of 3rd column: " + column3Sum
                + "\n" + "Sum of 4th column: " + column4Sum + "\n" + "Sum of 5th column: " + column5Sum);
    }

}
