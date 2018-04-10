package com.company.IFT;

import javax.swing.*;

/**
 * Created by rafaelszuminski on 4/5/18.
 */


public class TicTacToeVsComp extends TicTacToe {

    public TicTacToeVsComp() {
        super();
        play2();
    }

    @Override
    public void play() {
        super.play();
    }

    public void play2(){
        System.out.println( this ); // prints empty starting board
        boolean gameFin = false;
        while ( !this.checkForWin() && gameFin == false)  // continues to loop as long as there's no winner
        {
            System.out.println( "\nPlayer X's Turn..." );

            gameFin = playerCompute();

            System.out.print('\u000C'); // clears terminal window before printing updated board
            System.out.println( this );
            if ( this.checkForWin() )
            {
                System.out.println( "\nPlayer X wins!!!" );
                break; // stops while loop if X won
            }
            System.out.println( "\nPlayer O's Turn..." );

            //Player Row and Col are ints of the pos, let the comp decide.
            gameFin = computerCompute();


            System.out.print('\u000C'); // clears terminal window before printing updated board
            System.out.println( this );
            if ( this.checkForWin() )
            {
                System.out.println( "\nPlayer O wins!!!" );
            }
        } // end while loop
    }

    public boolean playerCompute(){
        if(!hasEmptySquare()){
            return true;
        }
        int playerXRow = Integer.parseInt( JOptionPane.showInputDialog( "Player X row?" ) );
        int playerXCol = Integer.parseInt( JOptionPane.showInputDialog( "Player X Column?" ) );
        if(gameBoard[playerXRow][playerXCol]==" ") {
            this.playerMove("X", playerXRow, playerXCol);
        }else{
            playerCompute();
        }
        return false;
    }

    public boolean computerCompute(){

        if(!hasEmptySquare()){
            return true;
        }

        int x;
        x = RandomNumber.grn(0,3);
        int y;
        y = RandomNumber.grn(0,3);

        if(gameBoard[x][y]==" ") {
            this.playerMove("O", x, y);
        }else{
            computerCompute();
        }
        return false;
    }

    public boolean terminator() {

        if (!hasEmptySquare()) {
            return true;
        }

        int x;
        x = RandomNumber.grn(0, 3);
        int y;
        y = RandomNumber.grn(0, 3);

        int ranChoice = 0;
        ranChoice = RandomNumber.grn(0, 4);

        if (ranChoice == 3) {
            if (gameBoard[0][0] == " " || gameBoard[0][2] == " " || gameBoard[2][0] == " " || gameBoard[2][2] == " ") {
                this.playerMove("O", RandomNumber.grn(0, 2), RandomNumber.grn(0, 2));
            }
        }

        if (gameBoard[x][y] == " ") {
            this.playerMove("O", x, y);
        } else {
            computerCompute();
        }

        return false;
    }

    public boolean hasEmptySquare() {
        for (int r = 0; r < gameBoard.length; r++) {
            for (int c = 0; c < gameBoard[0].length; c++) {
                if(gameBoard[r][c] == " "){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void playerMove(String player, int posRow, int posCol) {
        super.playerMove(player, posRow, posCol);
    }

    @Override
    public boolean checkAllColumns() {
        return super.checkAllColumns();
    }

    @Override
    public boolean checkAllDiagonals() {
        return super.checkAllDiagonals();
    }

    @Override
    public boolean checkAllRows() {
        return super.checkAllRows();
    }

    @Override
    public boolean checkDiagonal1() {
        return super.checkDiagonal1();
    }

    @Override
    public boolean checkDiagonal2() {
        return super.checkDiagonal2();
    }

    @Override
    public boolean checkForWin() {
        return super.checkForWin();
    }

    @Override
    public boolean checkColumn(int colNum) {
        return super.checkColumn(colNum);
    }

    @Override
    public boolean checkRow(int rowNum) {
        return super.checkRow(rowNum);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
