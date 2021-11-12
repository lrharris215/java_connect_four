package com.connectfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTest {

    Display display;
    TestClasses.TestStream testStream;

    @BeforeEach
    public void initTestStreamAndDisplay() {
         testStream = new TestClasses.TestStream(System.out);
         display = new Display(testStream);
    }
    @Test
    void testStringPrint() {
        String message = "Hello";
        display.print(message);

        assertEquals(message, testStream.stringState);
    }

    @Test
    void testStringPrintln() {
        String message = "Hello!!";
        display.println(message);

        assertEquals(message, testStream.stringState);
    }

    @Test
    void testCharPrint() {
        char message = 'C';
        display.print(message);
        assertEquals(message, testStream.charState);
    }

    @Test
    void testCharPrintln() {
        char message = 'D';
        display.print(message);
        assertEquals(message, testStream.charState);
    }


}