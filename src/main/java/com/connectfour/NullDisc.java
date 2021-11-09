package com.connectfour;

public class NullDisc implements Discable{
    String color;
    char symbol;

    private NullDisc(){
        color = "null";
        symbol = '\u25CC';
    }

    private static NullDisc nullDisc = new NullDisc();

    public static NullDisc getNullDisc(){
        return nullDisc;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public String getColor() {
        return color;
    }

}
