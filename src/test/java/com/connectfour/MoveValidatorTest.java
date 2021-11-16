package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveValidatorTest {

    MoveValidator moveValidator;
    Boardable testBoard;

    @BeforeEach
    void initBoardAndValidator(){
        moveValidator = new MoveValidator();
        testBoard = new TestClasses.TestBoard();
    }

    @Test
    void testIsValidDoesntAllowColGreaterThan7() {
        assertFalse(moveValidator.isValid(testBoard, 8));
    }

    @Test
    void testIsValidDoesntAllowColLessThanOne(){
        assertFalse(moveValidator.isValid(testBoard, 0));
    }

    @Test
    void testIsValidAcceptsColBetween1And7WhenThereIsSpace(){
        assertTrue(moveValidator.isValid(testBoard, 2));
    }

    @Test
    void testIsValidDoesntAllowColIfColIsFull(){
        fillBoardCol(testBoard, 2);

        assertFalse(moveValidator.isValid(testBoard, 3));
    }

    // fills a single column of the board with testDiscs
    void fillBoardCol(Boardable board, int col){
        TestClasses.TestDisc testDisc = new TestClasses.TestDisc();
        for(int i = 0; i < board.getGrid().length; i++){
            board.addDisc(testDisc, col);
        }

    }
}