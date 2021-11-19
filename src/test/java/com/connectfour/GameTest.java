package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.connectfour.Constants.*;
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
        assertEquals(testDisplay.getLastString(),Presenter.ANSI_GREEN + "\n" + CONGRATS + null + WON_THE_GAME + Presenter.ANSI_RESET);
    }

    @Test
    void testGameOverPrintsWinnerMessage(){
        Checker checker = checkers[checkers.length - 1];
        checker.setTie(false);
        game.gameOver();

        assertEquals(testDisplay.getLastString(),Presenter.ANSI_GREEN + "\n" + CONGRATS + null + WON_THE_GAME + Presenter.ANSI_RESET);
    }

    @Test
    void testGameOverPrintsTieMessage(){
       Checker checker = checkers[checkers.length - 1];
       checker.setTie(true);

       game.gameOver();
        System.out.println("test" + testDisplay.stringState);
        assertEquals(testDisplay.getLastString(),Presenter.ANSI_GREEN + "\n" + TIE + Presenter.ANSI_RESET);

    }

}