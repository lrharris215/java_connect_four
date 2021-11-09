package com.connectfour;

public class ConnectFour {
    public static void main(String[] args){
        Display display = new Display(System.out);
        display.println("Connect Four!");

        Board board = new Board();
        board.setUpGrid();

       Presenter.printBoard(display, board);
    }
}
