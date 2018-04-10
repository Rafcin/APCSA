package com.company.IFT;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String rowNum;
        String columnNum;
        rowNum = JOptionPane.showInputDialog("1st mult num: ");
        columnNum = JOptionPane.showInputDialog("2nd mult Num: ");
        int newRowNum = Integer.parseInt(rowNum) + 1;
        int newColumnNum = Integer.parseInt(columnNum) + 1;
        int[][] multTable = new int[newRowNum][newColumnNum];



        for (int r = 0; r < multTable.length; r++)
        {
            for (int c = 0; c < multTable[0].length; c++)
            {
                multTable[r][c] = (r * c);
                multTable[0][c] = c;
                multTable[r][0] = r;
                System.out.print(multTable[r][c] + "\t");
            }
            System.out.println();
        }
    }


}
