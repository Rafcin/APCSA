package com.company.IFT;

/**
 * Created by rafaelszuminski on 4/5/18.
 */
import javax.swing.JOptionPane;

public class TicTacToe
{
    String[][] gameBoard = new String[3][3];

    // zero arg constructor fills 2D array with a space character
    public TicTacToe()
    {
        for ( int r = 0; r < gameBoard.length; r++ )
        {
            for ( int c = 0; c < gameBoard[0].length; c++ )
            {
                gameBoard[r][c] = " ";
            }
        }
    }

    // main algorithm handling game play
    public void play()
    {
        System.out.println( this ); // prints empty starting board
        while ( !this.checkForWin() )  // continues to loop as long as there's no winner
        {
            System.out.println( "\nPlayer X's Turn..." );
            int playerXRow = Integer.parseInt( JOptionPane.showInputDialog( "Player X row?" ) );
            int playerXCol = Integer.parseInt( JOptionPane.showInputDialog( "Player X Column?" ) );
            this.playerMove( "X", playerXRow, playerXCol );
            System.out.print('\u000C'); // clears terminal window before printing updated board
            System.out.println( this );
            if ( this.checkForWin() )
            {
                System.out.println( "\nPlayer X wins!!!" );
                break; // stops while loop if X won
            }
            System.out.println( "\nPlayer O's Turn..." );
            int playerORow = Integer.parseInt( JOptionPane.showInputDialog( "Player O row?" ) );
            int playerOCol = Integer.parseInt( JOptionPane.showInputDialog( "Player O Column?" ) );
            this.playerMove( "O", playerORow, playerOCol );
            System.out.print('\u000C'); // clears terminal window before printing updated board
            System.out.println( this );
            if ( this.checkForWin() )
            {
                System.out.println( "\nPlayer O wins!!!" );
            }
        } // end while loop
    }

    // prints out a 3x3 grid in tic-tac-toe fashion
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

    public boolean checkRow( int rowNum )
    {
        if ( !gameBoard[rowNum][0].equals(" ") && gameBoard[rowNum][0].equals( gameBoard[rowNum][1] ) && gameBoard[rowNum][0].equals( gameBoard[rowNum][2] ))
        {
            return true;
        }
        return false;
    }

    public boolean checkColumn( int colNum )
    {
        if ( !gameBoard[0][colNum].equals(" ") && gameBoard[0][colNum].equals( gameBoard[1][colNum] ) && gameBoard[0][colNum].equals( gameBoard[2][colNum] ))
        {
            return true;
        }
        return false;
    }

    // checks diagonal \
    public boolean checkDiagonal1( )
    {
        if ( !gameBoard[0][0].equals(" ") && gameBoard[0][0].equals( gameBoard[1][1] ) && gameBoard[0][0].equals( gameBoard[2][2] ))
        {
            return true;
        }
        return false;
    }

    // checks other diagonal /
    public boolean checkDiagonal2( )
    {
        if ( !gameBoard[0][2].equals(" ") && gameBoard[0][2].equals( gameBoard[1][1] ) && gameBoard[0][2].equals( gameBoard[2][0] ))
        {
            return true;
        }
        return false;
    }
}
