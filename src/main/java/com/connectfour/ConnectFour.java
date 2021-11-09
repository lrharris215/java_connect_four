package com.connectfour;

public class ConnectFour {
    public static void main(String[] args){
        Display display = new Display(System.out);
        display.println("Connect Four!");

        Disc testDisc = new Disc("White", '\u25C9');
        Board testBoard = new Board();
        testBoard.setUpGrid();

       Presenter.printBoard(display, testBoard);

       testBoard.addDisc(testDisc, 1, 4);
       Presenter.printBoard(display, testBoard);

    }
}
