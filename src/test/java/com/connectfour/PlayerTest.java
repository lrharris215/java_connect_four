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
    Playerable testPlayer;
    Boardable testBoard;
    Validator testValidator;
    Displayable testDisplay;

    @Test
    void testTakeTurn() {
        testDisc = new TestClasses.TestDisc();
        testScanner = new TestClasses.TestScanner();
        testValidator = new TestClasses.TestValidator();
        testDisplay = new TestClasses.TestDisplay();
        testPlayer = new Player("Test", testDisc, testScanner, testValidator);
        testBoard = new TestClasses.TestBoard();


        testPlayer.takeTurn(testDisplay, testBoard);

        assertEquals(testBoard.findDisc(2,0), testPlayer.getDisc());
    }
}