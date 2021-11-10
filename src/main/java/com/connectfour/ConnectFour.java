package com.connectfour;

import java.util.Scanner;

public class ConnectFour {
    public static void main(String[] args){
        Display display = new Display(System.out);
        Scanner scanner = new Scanner(System.in);
        PlayerScanner playerScanner = new PlayerScanner(scanner);

        display.println("Werlcome to Connect Four!!\n");

        Disc disc1 = new Disc("red", '\u25C9');
        Disc disc2 = new Disc("blue",'\u25C9' );
        Board board = new Board();

        Player playerOne = new Player(disc1, playerScanner);
        Player playerTwo = new Player(disc2, playerScanner);

        Presenter.printBoard(display, board);

        playerOne.takeTurn(board);

        Presenter.printBoard(display, board);
    }
}
