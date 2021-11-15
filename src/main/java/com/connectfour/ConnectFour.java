package com.connectfour;

import java.util.Scanner;

public class ConnectFour {

    public static void main(String[] args){
        Game game = setUpGame();

        game.start();

        game.play();
    }

    private static Game setUpGame(){
        Display display;
        Scanner scanner;
        PlayerScanner playerScanner;
        Board board;
        Disc disc1;
        Disc disc2;
        Validator moveValidator;

        Player playerOne;
        Player playerTwo;

        display = new Display(System.out);
        scanner = new Scanner(System.in);
        playerScanner = new PlayerScanner(scanner);
        moveValidator = new MoveValidator();
        disc1 = new Disc("red", '\u25C9');
        disc2 = new Disc("blue", '\u25C9');
        board = new Board();


        playerOne = new Player("Player One", disc1, playerScanner, moveValidator);
        playerTwo = new Player("Player Two", disc2, playerScanner, moveValidator);

        return new Game(display, board, playerOne, playerTwo);
    }

}
