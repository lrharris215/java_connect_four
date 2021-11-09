package com.connectfour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscTest {

    @Test
    void testGetSymbol() {
        Disc testDisc = new Disc("blue", 'X');
        assertEquals('X', testDisc.getSymbol());
    }

    @Test
    void testGetColor() {
        Disc testDisc = new Disc("blue", 'X');
        assertEquals("blue", testDisc.getColor());
    }
}