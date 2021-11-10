package com.connectfour;

import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTest {
    @Test
    void testStringPrint() {
        TestStream testStream = new TestStream(System.out);
        Display display = new Display(testStream);
        String message = "Hello";
        display.print(message);

        assertEquals(message, testStream.stringState);
    }

    @Test
    void testStringPrintln() {
        TestStream testStream = new TestStream(System.out);
        Display display = new Display(testStream);
        String message = "Hello";
        display.println(message);

        assertEquals(message, testStream.stringState);
    }

    @Test
    void testCharPrint() {
        TestStream testStream = new TestStream(System.out);
        Display display = new Display(testStream);
        char message = 'C';
        display.print(message);
        assertEquals(message, testStream.charState);
    }

    @Test
    void testCharPrintln() {
        TestStream testStream = new TestStream(System.out);
        Display display = new Display(testStream);
        char message = 'C';
        display.print(message);
        assertEquals(message, testStream.charState);
    }

    private class TestStream extends PrintStream {
        String stringState;
        char charState;
        public TestStream(OutputStream out) {
            super(out);
        }

        @Override
        public void print(String message){
            stringState = message;
        }
        @Override
        public void println(String message){
            stringState = message;
        }

        @Override
        public void print(char message){
            charState = message;
        }
        @Override
        public void println(char message){
            charState = message;
        }

    }
}