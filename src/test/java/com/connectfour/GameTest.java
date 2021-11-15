package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    TestClasses.TestDisplay testDisplay;
    Playerable testPlayer;
    Board board;
    Game game;
    Validator testValidator;

    @BeforeEach
    void initAllTestClasses(){
        testDisplay = new TestClasses.TestDisplay();
        testPlayer = new TestClasses.TestPlayer();
        board = new Board();
        testValidator = new TestClasses.TestValidator();


        game = new Game(testDisplay, board, testPlayer, testPlayer);
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