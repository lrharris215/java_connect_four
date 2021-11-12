package com.connectfour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testStartDisplaysWelcomeMessage() {
        TestClasses.TestDisplay testDisplay = new TestClasses.TestDisplay();
        Playerable testPlayer = new TestClasses.TestPlayer();
        Board board = new Board();
        Scannable testScanner = new TestClasses.TestScanner();

        Game game = new Game(testDisplay, testScanner, board, testPlayer);

        game.start();

        assertEquals(testDisplay.getLastString(), game.WELCOME);
    }

    @Test
    void play() {
    }

}