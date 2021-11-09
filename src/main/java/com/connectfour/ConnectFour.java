package com.connectfour;

public class ConnectFour {
    public static void main(String[] args){
        System.out.println("Connect Four!");

        Disc testDisc = new Disc("White", '\u25C9');
        Board testBoard = new Board();

       Presenter.printBoard(testBoard);

    }
}
