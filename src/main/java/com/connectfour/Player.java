package com.connectfour;

import java.util.Scanner;

public class Player implements Playerable{


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

    @Override
    public int getInput(Displayable display, Boardable board){

        int colChoice = scanner.getColumn();

        while(!moveValidator.isValid(board, colChoice)){
            Presenter.printError(display, Constants.VALIDATION_ERROR);
            colChoice = scanner.getColumn();
        }
        return colChoice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Discable getDisc() {
        return disc;
    }

    @Override
    public String getDiscColor(){ return disc.getColor(); }
}
