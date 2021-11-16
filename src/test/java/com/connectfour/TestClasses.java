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

    public static class TestBoard implements Boardable {
        Discable[][] grid;
        public TestBoard(){
            grid = new Discable[3][3];
            setUpGrid();
        }
        @Override
        public void addDisc(Discable disc, int col) {
            for(int row = grid.length - 1; row >= 0; row--){
                if(isEmpty(row, col - 1)){
                    grid[row][col - 1] = disc;
                    break;
                }
            }
        }

        @Override
        public Discable findDisc(int row, int col) {

            return grid[row][col];
        }

        @Override
        public boolean isEmpty(int row, int col) {
            return grid[row][col] == NullDisc.getNullDisc();
        }

        @Override
        public void setUpGrid() {
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[0].length; j++){
                    grid[i][j] = NullDisc.getNullDisc();
                }
            }
        }

        @Override
        public Discable[][] getGrid() {
            return grid;
        }

        @Override
        public Discable[] getRow(int row) {
            return grid[row];
        }
    }
    public static class TestPlayer implements Playerable {

        @Override
        public void takeTurn(Displayable display, Boardable board) {

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
        public boolean isValid(Boardable board, int column) {
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
