package com.connectfour;

import java.io.OutputStream;
import java.io.PrintStream;

public class TestClasses {
    public static class TestDisc implements Discable {

        @Override
        public char getSymbol() {
            return 'X';
        }

        @Override
        public String getColor() {
            return "blue";
        }
    }
    public static class TestPlayer implements Playerable {

        @Override
        public void takeTurn(Board board) {

        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Discable getDisc() {
            return null;
        }
    }

    public static class TestScanner implements Scannable {

        @Override
        public int getColumn() {
            return 1;
        }
    }

    public static class TestStream extends PrintStream {
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

    public static class TestDisplay implements Displayable {
        String stringState;
        char charState;

        public TestDisplay(){
            stringState = "";
            charState = ' ';
        }
        @Override
        public void print(String message) {
            stringState = message;
        }

        @Override
        public void println(String message) {
            stringState = message;
        }

        @Override
        public void print(char message) {
            charState = message;
        }

        @Override
        public void println(char message) {
            charState = message;
        }

        public char getCharState(){
            return charState;
        }

        public String getStringState(){
            return stringState;
        }
    }


}
