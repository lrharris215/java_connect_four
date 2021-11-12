package com.connectfour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testStartDisplaysWelcomeMessage() {
        TestDisplay testDisplay = new TestDisplay();
        Playerable testPlayer = new TestPlayer();
        Board board = new Board();
        Scannable testScanner = new TestScanner();

        Game game = new Game(testDisplay, testScanner, board, testPlayer);

        game.start();

        assertEquals(testDisplay.getStringState(), game.WELCOME);
    }

    @Test
    void play() {
    }

    public class TestDisplay implements Displayable {
        String stringState;
        char charState;

        public TestDisplay(){
            stringState = "";
            charState = ' ';
        }
        @Override
        public void print(String message) {
            stringState = message;
        }

        @Override
        public void println(String message) {
            stringState = message;
        }

        @Override
        public void print(char message) {
            charState = message;
        }

        @Override
        public void println(char message) {
            charState = message;
        }

        public char getCharState(){
            return charState;
        }

        public String getStringState(){
            return stringState;
        }
    }

    public class TestScanner implements Scannable {

        @Override
        public int getColumn() {
            return 1;
        }
    }

    public class TestPlayer implements Playerable {

        @Override
        public void takeTurn(Board board) {

        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Discable getDisc() {
            return null;
        }
    }
    public class TestDisc implements Discable {

        @Override
        public char getSymbol() {
            return 'X';
        }

        @Override
        public String getColor() {
            return "null";
        }
    }

}