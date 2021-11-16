package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Boardable testBoard = new Board();

    @BeforeEach
    public void initBoard(){
        testBoard = new Board();
    }
    @Test
    void testAddDiscPutsDiscAtBottomOfEmptyRow() {
        Discable testDisc = new TestClasses.TestDisc();
        testBoard.addDisc(testDisc, 0);

        assertEquals( testDisc, testBoard.getGrid()[5][0]);

    }

    @Test
    void testAddDiscPlacesDiscOnTopOfOtherDiscs(){
        Discable testDisc = new TestClasses.TestDisc();
        testBoard.addDisc(testDisc, 0);
        testBoard.addDisc(testDisc, 0);

        assertEquals(testDisc, testBoard.getGrid()[4][0]);
    }

    @Test
    void testSetUpGrid() {
        testBoard.setUpGrid();
        assertEquals(testBoard.findDisc(0,0), NullDisc.getNullDisc());
    }

    @Test
    void testFindDisc(){
        Discable testDisc = new TestClasses.TestDisc();
        testBoard.getGrid()[0][0] = testDisc;

        assertEquals(testDisc, testBoard.findDisc(0,0));
    }


}