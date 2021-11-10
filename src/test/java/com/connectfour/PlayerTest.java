package com.connectfour;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Scanner scanner;
    TestDisc testDisc;
    TestScanner testScanner;
    Player testPlayer;
    Board board;

    @Test
    void testTakeTurn() {
        scanner = new Scanner(System.in);
        testDisc = new TestDisc();
        testScanner = new TestScanner(scanner);
        testPlayer = new Player(testDisc, testScanner);
        board = new Board();

        testPlayer.takeTurn(board);

        assertEquals(board.grid[5][0], testPlayer.disc);
    }

    public class TestScanner extends PlayerScanner {

        public TestScanner(Scanner scanner) {
            super(scanner);
        }

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