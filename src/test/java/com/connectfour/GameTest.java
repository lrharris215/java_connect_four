package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    TestClasses.TestDisplay testDisplay;
    Playerable testPlayer;
    Board board;
    Scannable testScanner;
    Game game;

    @BeforeEach
    void initAllTestClasses(){
        testDisplay = new TestClasses.TestDisplay();
        testPlayer = new TestClasses.TestPlayer();
        board = new Board();
        testScanner = new TestClasses.TestScanner();

        game = new Game(testDisplay, testScanner, board, testPlayer);
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