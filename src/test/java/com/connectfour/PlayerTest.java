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
    void testGetInput(){
        testDisc = new TestClasses.TestDisc();
        testScanner = new TestClasses.TestScanner();
        testValidator = new TestClasses.TestValidator();
        testDisplay = new TestClasses.TestDisplay();
        testPlayer = new Player("Test", testDisc, testScanner, testValidator);
        testBoard = new Board();

        assertEquals(1, testPlayer.getInput(testDisplay, testBoard));
    }
}