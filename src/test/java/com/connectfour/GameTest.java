package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    TestClasses.TestDisplay testDisplay;
    Playerable testPlayer;
    Boardable testBoard;
    Game game;
    Validator testValidator;
    Checker[] checkers;

    @BeforeEach
    void initAllTestClasses(){
        testDisplay = new TestClasses.TestDisplay();
        testPlayer = new TestClasses.TestPlayer();
        testBoard = new Board();
        testValidator = new TestClasses.TestValidator();
        checkers = new Checker[] {new TestClasses.TestChecker()};

        game = new Game(testDisplay, testBoard, checkers, testPlayer, testPlayer );

    }

    @Test
    void testStartDisplaysWelcomeMessage() {
        game.start();

        assertEquals(testDisplay.getLastString(), Constants.WELCOME);
    }

    @Test
    void testPlayPrintsTheBoard() {
        game.play();

        assertEquals(testDisplay.getLastString(),"  1    2    3    4    5    6    7 ");
    }

}