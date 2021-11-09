package com.connectfour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullDiscTest {

    @Test
    void testGetNullDisc() {
        NullDisc testNull = NullDisc.getNullDisc();
        assertEquals(testNull, NullDisc.getNullDisc());
    }

    @Test
    void getSymbol() {
        NullDisc testNull = NullDisc.getNullDisc();
        assertEquals('\u25CC', testNull.getSymbol());
    }

    @Test
    void getColor() {
        NullDisc testNull = NullDisc.getNullDisc();
        assertEquals("null", testNull.getColor());
    }
}