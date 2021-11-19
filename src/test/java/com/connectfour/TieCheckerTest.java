package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TieCheckerTest {
    Boardable board;
    Checker tieChecker;
    Discable testDisc;
    Discable testDisc2;

    @BeforeEach
    void initBoardAndGameChecker(){
        board = new TestClasses.TestBoard();
        tieChecker = new TieChecker();
        testDisc = new TestClasses.TestDisc();
        testDisc2 = new Disc("blue");

    }
    @Test
    void isGameOverReturnsTrueOnTie() {
        setUpTie(board);

        assertTrue(tieChecker.isGameOver(board));
    }

    void isGameOverReturnsFalseWhenNotTied(){
        setUpNotTie(board);

        assertFalse(tieChecker.isGameOver(board));
    }

    void setUpTie(Boardable board){


        board.addRow(0, testDisc, testDisc2, testDisc2, testDisc);
        board.addRow(1, testDisc2, testDisc, testDisc, testDisc2);
        board.addRow(2, testDisc, testDisc2, testDisc2, testDisc);
        board.addRow(3, testDisc, testDisc2, testDisc, testDisc);
    }

    void setUpNotTie(Boardable board){

        board.addRow(0, testDisc, testDisc2, testDisc2, NullDisc.getNullDisc());
        board.addRow(1, testDisc2, testDisc, testDisc, testDisc2);
        board.addRow(2, testDisc, testDisc2, testDisc2, testDisc);
        board.addRow(3, testDisc, testDisc2, testDisc, testDisc);
    }
}