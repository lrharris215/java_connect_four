package com.connectfour;

public class Disc implements Discable {
    String color;
    char symbol;
    // saving the unicode for the symbol I want to use: '\u25C9'

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
