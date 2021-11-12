package com.connectfour;

import java.util.Scanner;

public class ConnectFour {

    private static Display display;
    private static Scanner scanner;
    private static PlayerScanner playerScanner;
    private static Board board;
    private static Disc disc1;

    private static Player playerOne;

    private static Game game;


    public static void main(String[] args){
        game = setUpGame();

        game.start();

        game.play();
    }

    private static Game setUpGame(){
        display = new Display(System.out);
        scanner = new Scanner(System.in);
        playerScanner = new PlayerScanner(scanner);
        disc1 = new Disc("red", '\u25C9');
        board = new Board();
        playerOne = new Player("Player One", disc1, playerScanner);

        return new Game(display, playerScanner, board, playerOne);
    }

}
