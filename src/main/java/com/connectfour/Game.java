package com.connectfour;

public class Game {
    // string consts. might move later
    private static final String WELCOME = "Welcome to Connect Four!!\n";
    private static final String PLAYERCHOICE = ", please select which column you would like to place your disc.";
    private static final String DISCCOLOR = "Your color is ";

    // instance vars
    Displayable display;
    Scannable scanner;
    Board board;
    Player playerOne;



    public Game(Displayable display, Scannable scanner, Board board, Player playerOne){
        this.display = display;
        this.scanner = scanner;
        this.playerOne = playerOne;
        this.board = board;
    }

    public void start(){
        display.println(WELCOME);

        Presenter.printBoard(display, board);
    }

    public void play(){
        nextTurn(playerOne);
        Presenter.printBoard(display, board);
    }

    public void nextTurn(Player player){
        display.println(player.name + PLAYERCHOICE);
        display.println(DISCCOLOR + player.disc.getColor());
        player.takeTurn(board);
    }


}
