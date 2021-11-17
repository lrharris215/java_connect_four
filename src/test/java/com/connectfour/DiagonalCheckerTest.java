package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalCheckerTest {
    Board board;
    Checker diagonalChecker;

    @BeforeEach
    void initBoardAndGameChecker(){
        board = new Board();
        diagonalChecker = new DiagonalChecker();

    }

    @Test
    void testIsGameOverReturnsTrueIf4InARowDiagonally(){

    }

    @Test
    void testIsGameOverReturnsFalseWhenEmpty(){
        assertFalse(diagonalChecker.isGameOver(board));
    }
    
    @Test
    void testIsGameOverReturnsFalseIfMixedDiscs(){}
}