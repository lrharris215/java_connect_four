package com.connectfour;

public class ConnectFour {
    public static void main(String[] args){
        System.out.println("Connect Four!");

        Disc testDisc = new Disc("White", '\u25C9');
        Board testBoard = new Board();
        testBoard.setUpGrid();

       Presenter.printBoard(testBoard);

       testBoard.addDisc(testDisc, 1, 4);
        Presenter.printBoard(testBoard);

    }
}
