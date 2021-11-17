package com.connectfour;

public class Game {
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
        display.println(Constants.WELCOME);
    }

    public void play(){
        Presenter.printBoard(display, board);
        // Will replace w/ gameOver check later
        for(int i = 0; i < 10; i++){
            nextTurn(activePlayer);
            Presenter.printBoard(display, board);
            switchPlayers();
        }
    }

    private void nextTurn(Playerable player){
        display.println(player.getName() + Constants.PLAYER_CHOICE);
        display.println(Constants.DISC_COLOR + player.getDiscColor());
        int nextCol = player.getInput(display, board);
        board.addDisc(player.getDisc(), nextCol);
    }

    private void switchPlayers(){
        activePlayer = activePlayer == playerOne ? playerTwo : playerOne;
    }
}
