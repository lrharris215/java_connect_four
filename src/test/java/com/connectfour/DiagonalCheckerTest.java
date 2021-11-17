package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalCheckerTest {
    Boardable board;
    Checker diagonalChecker;

    @BeforeEach
    void initBoardAndGameChecker(){
        board = new TestClasses.TestBoard();
        diagonalChecker = new DiagonalChecker();

    }

    @Test
    void testIsGameOverReturnsTrueIf4InARowDiagonally(){
        setDiagonalWin(board);

        assertTrue(diagonalChecker.isGameOver(board));
    }

    @Test
    void testIsGameOverReturnsFalseWhenEmpty(){
        assertFalse(diagonalChecker.isGameOver(board));
    }

    @Test
    void testIsGameOverReturnsFalseIfMixedDiscs(){
        //TODO: fill this in.
    }

    //helper methods

    void setDiagonalWin(Boardable board){
        Discable testDisc = new TestClasses.TestDisc();

        board.addDisc(testDisc, 0, 0);
        board.addDisc(testDisc, 1, 1);
        board.addDisc(testDisc, 2, 2);
        board.addDisc(testDisc, 3, 3);

    }
}