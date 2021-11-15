package com.connectfour;

import java.util.Scanner;

public class Player implements Playerable{
    Discable disc;
    Scannable scanner;
    String name;
    Validator moveValidator;

    public Player(String name, Discable disc, Scannable scanner){
        this.disc = disc;
        this.scanner = scanner;
        this.name = name;

    }

    public void takeTurn(Board board, Validator moveValidator){
        int colChoice = scanner.getColumn();
        while(!moveValidator.isValid(board, colChoice)){
            colChoice = scanner.getColumn();
        }
        colChoice = colChoice - 1;
        placeDisc(board, colChoice);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Discable getDisc() {
        return disc;
    }


    private void placeDisc(Board board, int col){
        board.addDisc(disc, col);
    }

}
