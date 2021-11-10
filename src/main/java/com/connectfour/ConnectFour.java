package com.connectfour;

import java.util.Scanner;

public class ConnectFour {

    private static Display display;
    private static Scanner scanner;
    private static PlayerScanner playerScanner;
    private static Board board;
    private static Disc disc1;

    private static Player playerOne;


    public static void main(String[] args){
        setUpGame();

        display.println("Welcome to Connect Four!!\n");

        Presenter.printBoard(display, board);

        playerOne.takeTurn(board);

        Presenter.printBoard(display, board);
    }

    private static void setUpGame(){
        display = new Display(System.out);
        scanner = new Scanner(System.in);
        playerScanner = new PlayerScanner(scanner);
        disc1 = new Disc("red", '\u25C9');
        board = new Board();
        playerOne = new Player(disc1, playerScanner);
    }

}
