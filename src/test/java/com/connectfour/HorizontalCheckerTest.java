package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorizontalCheckerTest {
    Board board;
    Checker horizontalChecker;

    @BeforeEach
    void initBoardAndGameChecker(){
        board = new Board();
        horizontalChecker = new HorizontalChecker();

    }


    @Test
    void testHorizontalWinReturnsTrueIf4InARow() {

        setHorizontalWinner(board);

        assertTrue(horizontalChecker.isGameOver(board));
    }

    @Test
    void testHorizontalWinReturnsFalseIfBoardEmpty(){
        assertFalse(horizontalChecker.isGameOver(board));
    }

    @Test
    void testHorizontalWinnerReturnsFalseIfMixedDiscs(){
        setUpFailingHorizontalTest(board);
        assertFalse(horizontalChecker.isGameOver(board));
    }

    // helper methods
    void setHorizontalWinner(Board board){
        Discable testDisc = new TestClasses.TestDisc();
        board.addDisc(testDisc, 1);
        board.addDisc(testDisc, 2);
        board.addDisc(testDisc, 3);
        board.addDisc(testDisc, 4);
    }

    void setUpFailingHorizontalTest(Board board){
        Discable testDisc1 = new TestClasses.TestDisc();
        Discable testDisc2 = new Disc("blue");

        board.addDisc(testDisc1, 1);
        board.addDisc(testDisc1, 2);
        board.addDisc(testDisc1, 3);
        board.addDisc(testDisc2, 4);
        board.addDisc(testDisc2, 5);
        board.addDisc(testDisc2, 6);
        board.addDisc(testDisc1, 7);
    }
}