package com.connectfour;

public class Game {
    // string consts. might move later
    public static final String WELCOME = "Welcome to Connect Four!!\n";
    private static final String PLAYERCHOICE = ", please select which column you would like to place your disc.";
    private static final String DISCCOLOR = "Your color is ";

    // instance vars
    Displayable display;
    Scannable scanner;
    Board board;
    Playerable playerOne;



    public Game(Displayable display, Scannable scanner, Board board, Playerable playerOne){
        this.display = display;
        this.scanner = scanner;
        this.playerOne = playerOne;
        this.board = board;
    }

    public void start(){
        display.println(WELCOME);
    }

    public void play(){
        Presenter.printBoard(display, board);
        nextTurn(playerOne);
        Presenter.printBoard(display, board);
    }

    private void nextTurn(Playerable player){
        display.println(player.getName() + PLAYERCHOICE);
        display.println(DISCCOLOR + player.getDisc().getColor());
        player.takeTurn(board);
    }


}
