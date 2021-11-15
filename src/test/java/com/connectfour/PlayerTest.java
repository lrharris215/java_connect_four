package com.connectfour;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Discable testDisc;
    Scannable testScanner;
    Player testPlayer;
    Board board;
    Validator testValidator;
    Displayable testDisplay;

    @Test
    void testTakeTurn() {
        testDisc = new TestClasses.TestDisc();
        testScanner = new TestClasses.TestScanner();
        testValidator = new TestClasses.TestValidator();
        testDisplay = new TestClasses.TestDisplay();
        testPlayer = new Player("Test", testDisc, testScanner, testValidator);
        board = new Board();


        testPlayer.takeTurn(testDisplay, board);

        assertEquals(board.grid[5][0], testPlayer.disc);
    }
}