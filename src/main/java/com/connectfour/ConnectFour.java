package com.connectfour;

public class ConnectFour {
    public static void main(String[] args){
        Display display = new Display();
        display.println("Connect Four!\n");

        Disc testDisc = new Disc("red", '\u25C9');
        Disc otherDisc = new Disc("blue",'\u25C9' );
        Board board = new Board();

        Presenter.printBoard(display, board);

        board.addDisc(testDisc, 0 , 0);
        board.addDisc(otherDisc, 3 , 4);
        Presenter.printBoard(display, board);
    }
}
