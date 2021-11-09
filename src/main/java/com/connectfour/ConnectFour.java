package com.connectfour;

public class ConnectFour {
    public static void main(String[] args){
        Display display = new Display();
        display.println("Connect Four!\n");

        Board board = new Board();

       Presenter.printBoard(display, board);
    }
}
