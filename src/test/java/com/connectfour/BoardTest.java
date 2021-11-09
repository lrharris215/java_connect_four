package com.connectfour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void testAddDisc() {
        // TODO: write test for addDisc;
    }

    @Test
    void testSetUpGrid() {
        Board testBoard = new Board();
        testBoard.setUpGrid();
        assertEquals(testBoard.findDisc(0,0), NullDisc.getNullDisc());
    }

    @Test
    void testFindDisc(){
        Board testBoard = new Board();
        Discable testDisc = new TestDisc();
        testBoard.grid[0][0] = testDisc;

        assertEquals(testDisc, testBoard.findDisc(0,0));
    }

    public class TestDisc implements Discable {

        @Override
        public char getSymbol() {
            return 'X';
        }

        @Override
        public String getColor() {
            return "blue";
        }
    }
}