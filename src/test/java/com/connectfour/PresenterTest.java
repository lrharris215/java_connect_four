package com.connectfour;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PresenterTest {

    @Test
    void testPrintBoard() {
        TestDisplay testDisplay = new TestDisplay();
        Board board = new Board();
        Presenter.printBoard(testDisplay, board);

        assertEquals("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾", testDisplay.getStringState());
    }

    @Test
    void testPrintDisc() {
        TestDisplay testDisplay = new TestDisplay();
        Discable testDisc = new TestDisc();
        Presenter.printDisc(testDisplay, testDisc);

        assertEquals(testDisplay.getCharState(), testDisc.getSymbol());
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