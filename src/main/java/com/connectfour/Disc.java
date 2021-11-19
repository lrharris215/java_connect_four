package com.connectfour;

public class Disc implements Discable {
    String color;
    char symbol;

    public Disc(String color){
        this.color = color;
        this.symbol = '\u25C9';
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
