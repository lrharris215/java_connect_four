package com.connectfour;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    TestDisc testDisc;
    TestScanner testScanner;
    Player testPlayer;
    Board board;

    @Test
    void testTakeTurn() {
        testDisc = new TestDisc();
        testScanner = new TestScanner();
        testPlayer = new Player(testDisc, testScanner);
        board = new Board();

        testPlayer.takeTurn(board);

        assertEquals(board.grid[5][0], testPlayer.disc);
    }

    public class TestScanner implements Scannable {

        @Override
        public int getColumn() {
           return 0;
        }
    }

    public class TestDisc implements Discable {

        @Override
        public char getSymbol() {
            return 'X';
        }

        @Override
        public String getColor() {
            return "blue";
        }
    }
}