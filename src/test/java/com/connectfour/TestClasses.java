package com.connectfour;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

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
            grid = new Discable[4][4];
            setUpGrid();
        }

        public void addDisc(Discable disc, int col) {
        }

        public void addDisc(Discable disc, int row, int col){
            grid[row][col] = disc;
        }

        public void addRow(int row, Discable disc1, Discable disc2, Discable disc3, Discable disc4){
            grid[row][0] = disc1;
            grid[row][1] = disc2;
            grid[row][2] = disc3;
            grid[row][3] = disc4;
        }

        public Discable findDisc(int row, int col) {
            return grid[row][col];
        }

        public boolean isEmpty(int row, int col) {
            return grid[row][col] == NullDisc.getNullDisc();
        }

        public void setUpGrid() {
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[0].length; j++){
                    grid[i][j] = NullDisc.getNullDisc();
                }
            }
        }

        public Discable[][] getGrid() {
            return grid;
        }

        public Discable[] getRow(int row) {
            return grid[row];
        }

    }

    public static class TestPlayer implements Playerable {

        @Override
        public int getInput(Displayable display, Boardable board){
            return 1;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Discable getDisc() {
            return new TestDisc();
        }

        @Override
        public String getDiscColor() {
            return "Test Color";
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

        public boolean isValid(Boardable board, int row, int col) { return true; }
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

    public static class TestChecker implements Checker {
        Boolean isTie = false;
        public boolean isGameOver(Boardable board) {
            int num = (int) Math.floor(Math.random() * 11);
            return num >= 7;
        }

        public boolean isTie() {
            return isTie;
        }
        public void setTie(Boolean bool){
            isTie = bool;
        }
    }

}
