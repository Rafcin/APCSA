package com.company.IFT;

import javax.swing.*;

/**
 * Created by rafaelszuminski on 4/7/18.
 */
public class Player extends Gameboard {

    public boolean playerCompute(){
        if(!checkEmptySquare()){
            return true;
        }
        int playerXRow = Integer.parseInt( JOptionPane.showInputDialog( "Player X row?" ) );
        int playerXCol = Integer.parseInt( JOptionPane.showInputDialog( "Player X Column?" ) );
        if(getGameBoard()[playerXRow][playerXCol]==" ") {
            this.playerMove("X", playerXRow, playerXCol);
        }else{
            playerCompute();
        }
        return false;
    }
}
