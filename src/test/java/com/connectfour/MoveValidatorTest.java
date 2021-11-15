package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveValidatorTest {

    MoveValidator moveValidator;
    Board board;

    @BeforeEach
    void initBoardAndValidator(){
        moveValidator = new MoveValidator();
        board = new Board();
    }

    @Test
    void testIsValidDoesntAllowColGreaterThan7() {
        assertFalse(moveValidator.isValid(board, 8));
    }

    @Test
    void testIsValidDoesntAllowColLessThanOne(){
        assertFalse(moveValidator.isValid(board, 0));
    }

    @Test
    void testIsValidAcceptsColBetween1And7WhenThereIsSpace(){
        assertTrue(moveValidator.isValid(board, 5));
    }

    @Test
    void testIsValidDoesntAllowColIfColIsFull(){
        fillBoardCol(board, 3);

        assertFalse(moveValidator.isValid(board, 4));
    }

    // fills a single column of the board with testDiscs
    void fillBoardCol(Board board, int col){
        TestClasses.TestDisc testDisc = new TestClasses.TestDisc();
        for(int i = 0; i < board.grid.length; i++){
            board.addDisc(testDisc, col);
        }

    }
}