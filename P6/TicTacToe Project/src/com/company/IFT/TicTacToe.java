package com.company.IFT;

import javax.swing.*;

/**
 * Created by rafaelszuminski on 4/7/18.
 */

public class TicTacToe extends Gameboard
{

    Player player = new Player();
    Gameboard gameboard = new Gameboard();

    // zero arg constructor fills 2D array with a space character
    public TicTacToe()
    {
        for ( int r = 0; r < getGameBoard().length; r++ )
        {
            for ( int c = 0; c < getGameBoard()[0].length; c++ )
            {
                getGameBoard()[r][c] = " ";
            }
        }
    }

    // main algorithm handling game play
    public void play()
    {
        System.out.println( this ); // prints empty starting board
        boolean gameFin = false;
        while ( !this.checkForWin() && gameFin == false)  // continues to loop as long as there's no winner
        {
            System.out.println( "\nPlayer X's Turn..." );

            gameFin = player.playerCompute();

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

    public boolean computerCompute(){

        if(!checkEmptySquare()){
            return true;
        }

        int x;
        x = RandomNumber.grn(0,3);
        int y;
        y = RandomNumber.grn(0,3);

        if(getGameBoard()[x][y]==" ") {
            this.playerMove("O", x, y);
        }else{
            computerCompute();
        }
        return false;
    }







}
