package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PresenterTest {
    TestClasses.TestDisplay testDisplay;

    @BeforeEach
    public void initTestDisplay(){
        testDisplay = new TestClasses.TestDisplay();
    }

    @Test
    void testPrintBoard() {

        Boardable board = new TestClasses.TestBoard();
        Presenter.printBoard(testDisplay, board);

        assertEquals("  1    2    3    4    5    6    7 ", testDisplay.getLastString());
    }

    @Test
    void testPrintDisc() {

        Discable testDisc = new TestClasses.TestDisc();
        Presenter.printDisc(testDisplay, testDisc);

        assertEquals(testDisplay.getLastChar(), testDisc.getSymbol());
    }

    @Test
    void testPrintError() {
        String error = "ERROR";
        String errorWithColors = Presenter.ANSI_RED + error + Presenter.ANSI_RESET;
        Presenter.printError(testDisplay, error);

        assertEquals(errorWithColors, testDisplay.getLastString());
    }

}