package com.connectfour;

public class Game {
    // string consts. might move later
    public static final String WELCOME = "Welcome to Connect Four!!\n";
    private static final String PLAYER_CHOICE = ", please select which column you would like to place your disc.";
    private static final String DISC_COLOR = "Your color is ";

    // instance vars
    Displayable display;
    Boardable board;
    Playerable playerOne;
    Playerable playerTwo;
    Playerable activePlayer;


    public Game(Displayable display, Boardable board, Playerable playerOne, Playerable playerTwo){

        this.display = display;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.board = board;

        activePlayer = playerOne;

    }

    public void start(){
        display.println(WELCOME);
    }

    public void play(){
        Presenter.printBoard(display, board);
        for(int i = 0; i < 10; i++){
            nextTurn(activePlayer);
            Presenter.printBoard(display, board);
            switchPlayers();
        }
    }

    private void nextTurn(Playerable player){
        display.println(player.getName() + PLAYER_CHOICE);
        display.println(DISC_COLOR + player.getDisc().getColor());
        player.takeTurn(display, board);
    }

    private void switchPlayers(){
        activePlayer = activePlayer == playerOne ? playerTwo : playerOne;
    }
}
