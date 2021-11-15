package com.connectfour;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class TestClasses {
    public static class TestDisc implements Discable {

        @Override
        public char getSymbol() {
            return 'X';
        }

        @Override
        public String getColor() {
            return "black";
        }
    }
    public static class TestPlayer implements Playerable {

        @Override
        public void takeTurn(Board board, Validator validator) {

        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Discable getDisc() {
            return new TestDisc();
        }
    }

    public static class TestScanner implements Scannable {

        @Override
        public int getColumn() {
            return 1;
        }
    }

    public static class TestValidator implements Validator {

        @Override
        public boolean isValid(Board board, int column) {
            return true;
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
        ArrayList<String> stringState;
        ArrayList<Character> charState;

        public TestDisplay(){
            stringState = new ArrayList<String>();
            charState = new ArrayList<Character>();
        }

        @Override
        public void print(String message) {
            stringState.add(message);
        }

        @Override
        public void println(String message) {
            stringState.add(message);
        }

        @Override
        public void print(char message) {
            charState.add(message);
        }

        @Override
        public void println(char message) {
            charState.add(message);
        }

        public String getLastString(){
            return stringState.get(stringState.size() - 1);
        }

        public char getLastChar(){
            return charState.get(charState.size() - 1);
        }

    }


}
