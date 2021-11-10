package com.connectfour;

import java.util.Scanner;

public class Player {
    Discable disc;
    Scannable scanner;
    String name;

    public Player(String name, Discable disc, Scannable scanner){
        this.disc = disc;
        this.scanner = scanner;
        this.name = name;

    }

    public void takeTurn(Board board){
        int colChoice = scanner.getColumn();
        colChoice = colChoice - 1;
        placeDisc(board, colChoice);
    }

    private void placeDisc(Board board, int col){
        board.addDisc(disc, col);
    }

}
