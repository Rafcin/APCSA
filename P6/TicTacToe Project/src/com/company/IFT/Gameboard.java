package com.company.IFT;

/**
 * Created by rafaelszuminski on 4/7/18.
 */

public class Gameboard {

    private String[][] gameBoard;

    public Gameboard(){
        //By default game board is null/empty
        gameBoard = new String[3][3];

    }

    public String toString()
    {
        String output = new String();
        output += " " + gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2] + "\n" +
                "-----------\n" +
                " " + gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2] + "\n" +
                "-----------\n" +
                " " + gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2];
        return output;
    }

    // allows for a position to be filled with a String, X or O
    public void playerMove( String player, int posRow, int posCol )
    {
        gameBoard[posRow][posCol] = player;
    }

    // checks to see if all characters in a row, column, or diagonal are equal to each other and not a space
    public boolean checkForWin()
    {
        return ( checkAllRows() || checkAllColumns() || checkAllDiagonals() );
    }

    public boolean checkAllRows()
    {
        return ( checkRow(0) || checkRow(1) || checkRow(2) );
    }

    public boolean checkAllColumns()
    {
        return ( checkColumn(0) || checkColumn(1) || checkColumn(2) );
    }

    public boolean checkAllDiagonals()
    {
        return ( checkDiagonal1() || checkDiagonal2() );
    }

    public boolean checkEmptySquare() {
        for (int r = 0; r < gameBoard.length; r++) {
            for (int c = 0; c < gameBoard[0].length; c++) {
                if(gameBoard[r][c] == " "){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkRow( int rowNum )
    {
        if ( !gameBoard[rowNum][0].equals(" ") && gameBoard[rowNum][0].equals( gameBoard[rowNum][1] ) && gameBoard[rowNum][0].equals( gameBoard[rowNum][2] )) {
            return true;
        }
        return false;
    }

    public boolean checkColumn( int colNum )
    {
        if ( !gameBoard[0][colNum].equals(" ") && gameBoard[0][colNum].equals( gameBoard[1][colNum] ) && gameBoard[0][colNum].equals( gameBoard[2][colNum] )) {
            return true;
        }
        return false;
    }

    // checks diagonal \
    public boolean checkDiagonal1( )
    {
        if ( !gameBoard[0][0].equals(" ") && gameBoard[0][0].equals( gameBoard[1][1] ) && gameBoard[0][0].equals( gameBoard[2][2] )) {
            return true;
        }
        return false;
    }

    // checks other diagonal /
    public boolean checkDiagonal2( )
    {
        if ( !gameBoard[0][2].equals(" ") && gameBoard[0][2].equals( gameBoard[1][1] ) && gameBoard[0][2].equals( gameBoard[2][0] )) {
            return true;
        }
        return false;
    }

    public String[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }


}
