package com.connectfour;

import java.util.Scanner;

public class Player {
    Discable disc;
    PlayerScanner scanner;

    public Player(Discable disc, PlayerScanner scanner){
        this.disc = disc;
        this.scanner = scanner;

    }

    public void takeTurn(Board board){
        int colChoice = scanner.getColumn();
        placeDisc(board, colChoice);
    }

    private void placeDisc(Board board, int col){
        board.addDisc(disc, col);
    }

}
