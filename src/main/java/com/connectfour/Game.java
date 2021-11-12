package com.connectfour;

public class Game {
    //this will actually be in charge of playing the game.
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
        display.println("Welcome to Connect Four!!\n");

        Presenter.printBoard(display, board);
    }

    public void play(){
        nextTurn(playerOne);
        Presenter.printBoard(display, board);
    }

    public void nextTurn(Player player){
        display.println(player.name + ", please select which column you would like to place your disc.");
        display.println("Your color is " + player.disc.getColor());
        player.takeTurn(board);
    }


}
