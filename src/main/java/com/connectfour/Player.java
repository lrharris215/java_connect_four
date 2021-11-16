package com.connectfour;

import java.util.Scanner;

public class Player implements Playerable{
    public final String VALIDATION_ERROR = "That is not a valid move! Please choose a number between 1 and 7";

    Discable disc;
    Scannable scanner;
    String name;
    Validator moveValidator;

    public Player(String name, Discable disc, Scannable scanner, Validator moveValidator){
        this.disc = disc;
        this.scanner = scanner;
        this.name = name;
        this.moveValidator = moveValidator;

    }

    public void takeTurn(Displayable display, Boardable board){
        int colChoice = scanner.getColumn();
        while(!moveValidator.isValid(board, colChoice)){
            Presenter.printError(display, VALIDATION_ERROR);
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


    private void placeDisc(Boardable board, int col){
        board.addDisc(disc, col);
    }

}
