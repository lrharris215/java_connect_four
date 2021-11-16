package com.connectfour;

public class Game {
    // instance vars
    Displayable display;
    Boardable board;
    Playerable playerOne;


    public Game(Displayable display, Boardable board, Playerable playerOne){
        this.display = display;
        this.playerOne = playerOne;
        this.board = board;

    }

    public void start(){
        display.println(Constants.WELCOME);
    }

    public void play(){
        Presenter.printBoard(display, board);
        nextTurn(playerOne);
        Presenter.printBoard(display, board);
    }

    private void nextTurn(Playerable player){
        display.println(player.getName() + Constants.PLAYER_CHOICE);
        //TODO player.getColor
        display.println(Constants.DISC_COLOR + player.getDisc().getColor());
        int nextCol = player.getInput(display, board);
        board.addDisc(player.getDisc(), nextCol);
    }
}
