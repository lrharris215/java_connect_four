package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorizontalCheckerTest {
    Boardable board;
    Checker horizontalChecker;

    @BeforeEach
    void initBoardAndGameChecker(){
        board = new TestClasses.TestBoard();
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
    void setHorizontalWinner(Boardable board){
        Discable testDisc = new TestClasses.TestDisc();
        board.addDisc(testDisc, 3,0);
        board.addDisc(testDisc, 3,1);
        board.addDisc(testDisc, 3,2);
        board.addDisc(testDisc, 3,3);

    }

    void setUpFailingHorizontalTest(Boardable board){
        Discable testDisc1 = new TestClasses.TestDisc();
        Discable testDisc2 = new Disc("blue");


        board.addDisc(testDisc2, 3,0);
        board.addDisc(testDisc1, 3,1);
        board.addDisc(testDisc1, 3,2);
        board.addDisc(testDisc1, 3,3);


    }
}