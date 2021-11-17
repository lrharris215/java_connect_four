package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerticalCheckerTest {

    Board board;
    Checker verticalChecker;

    @BeforeEach
    void initBoardAndGameChecker(){
        board = new Board();
        verticalChecker = new VerticalChecker();

    }
    @Test
    void testVerticalWinReturnsTrueIfFourInARow() {
        setVerticalWin(board);
        assertTrue(verticalChecker.isGameOver(board));
    }

    @Test
    void testVerticalWinReturnsFalseIfEmpty() {
        assertFalse(verticalChecker.isGameOver(board));
    }

    @Test
    void testVerticalWinReturnsFalseIfMixedDiscs(){
        setUpFailingVerticalTest(board);
        assertFalse(verticalChecker.isGameOver(board));
    }

    // helper methods
    void setVerticalWin(Board board){
        Discable testDisc = new TestClasses.TestDisc();
        board.addDisc(testDisc, 1);
        board.addDisc(testDisc, 1);
        board.addDisc(testDisc, 1);
        board.addDisc(testDisc, 1);
    }

    void setUpFailingVerticalTest(Board board){
        Discable testDisc1 = new TestClasses.TestDisc();
        Discable testDisc2 = new Disc("blue");

        board.addDisc(testDisc1, 1);
        board.addDisc(testDisc1, 1);
        board.addDisc(testDisc1, 1);
        board.addDisc(testDisc2, 1);
        board.addDisc(testDisc2, 1);
        board.addDisc(testDisc2, 1);
    }
}