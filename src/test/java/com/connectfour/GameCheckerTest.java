package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCheckerTest {

    Board board;
    GameChecker gameChecker;

    @BeforeEach
    void initBoardAndGameChecker(){
        board = new Board();
        gameChecker = new GameChecker();
    }

    @Test
    void testHorizontalWinReturnsTrueIf4InARow() {

        setHorizontalWinner(board);

        assertTrue(gameChecker.horizontalWin(board));
    }

    @Test
    void testHorizontalWinReturnsFalseIfBoardEmpty(){
        assertFalse(gameChecker.horizontalWin(board));
    }

    @Test
    void testHorizontalWinnerReturnsFalseIfMixedDiscs(){
        setUpFailingHorizontalTest(board);
        assertFalse(gameChecker.horizontalWin(board));
    }

    @Test
    void testVerticalWin() {
    }

    @Test
    void testDiagonalWin() {
    }

    @Test
    void testGameOver() {
    }

    //helper set up methods
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