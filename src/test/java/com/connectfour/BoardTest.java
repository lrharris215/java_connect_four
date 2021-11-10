package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board testBoard = new Board();

    @BeforeEach
    public void initBoard(){
        testBoard = new Board();
    }
    @Test
    void testAddDisc() {
        // TODO: write test for addDisc;
    }

    @Test
    void testSetUpGrid() {
        testBoard.setUpGrid();
        assertEquals(testBoard.findDisc(0,0), NullDisc.getNullDisc());
    }

    @Test
    void testFindDisc(){
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