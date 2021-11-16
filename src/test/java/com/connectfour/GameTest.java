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

    @BeforeEach
    void initAllTestClasses(){
        testDisplay = new TestClasses.TestDisplay();
        testPlayer = new TestClasses.TestPlayer();
        testBoard = new TestClasses.TestBoard();
        testValidator = new TestClasses.TestValidator();



        game = new Game(testDisplay, testBoard, testPlayer, testPlayer );

    }

    @Test
    void testStartDisplaysWelcomeMessage() {
        game.start();

        assertEquals(testDisplay.getLastString(), game.WELCOME);
    }

    @Test
    void testPlayPrintsTheBoard() {
        game.play();

        assertEquals(testDisplay.getLastString(),"  1    2    3    4    5    6    7 ");
    }

}