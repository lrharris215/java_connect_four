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

        Board board = new Board();
        Presenter.printBoard(testDisplay, board);

        assertEquals("  1    2    3    4    5    6    7 ", testDisplay.getLastString());
    }

    @Test
    void testPrintDisc() {

        Discable testDisc = new TestClasses.TestDisc();
        Presenter.printDisc(testDisplay, testDisc);

        assertEquals(testDisplay.getLastChar(), testDisc.getSymbol());
    }

}