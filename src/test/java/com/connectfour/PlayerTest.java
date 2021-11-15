package com.connectfour;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    TestClasses.TestDisc testDisc;
    TestClasses.TestScanner testScanner;
    Player testPlayer;
    Board board;
    Validator testValidator;


    @Test
    void testTakeTurn() {
        testDisc = new TestClasses.TestDisc();
        testScanner = new TestClasses.TestScanner();
        testPlayer = new Player("Test", testDisc, testScanner);
        board = new Board();
        testValidator = new TestClasses.TestValidator();

        testPlayer.takeTurn(board, testValidator);

        assertEquals(board.grid[5][0], testPlayer.disc);
    }
}