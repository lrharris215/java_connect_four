package com.connectfour;

public class Game {
    // instance vars
    Displayable display;
    Boardable board;
    Playerable playerOne;
    Playerable playerTwo;
    Playerable activePlayer;
    Checker[] checkers;

    public Game(Displayable display, Boardable board, Checker[] checkers, Playerable playerOne, Playerable playerTwo){

        this.display = display;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.board = board;
        this.checkers = checkers;

        activePlayer = playerOne;

    }

    public void start(){
        display.println(Constants.WELCOME);
    }

    public void play(){
        Presenter.printBoard(display, board);

        while(!isGameOver()){
            nextTurn(activePlayer);
            Presenter.printBoard(display, board);
            switchPlayers();
        }
        gameOver();
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

    private boolean isGameOver() {
        for (Checker checker : checkers) {
            if (checker.isGameOver(board)) {
                return true;
            }
        }
        return false;
    }

    public void gameOver(){
       Checker tieChecker = checkers[checkers.length - 1];
       if(tieChecker.isTie()){
           Presenter.printTie(display);
       }else {
           switchPlayers();
           Presenter.printWinner(display, activePlayer.getName());
       }
    }
}
