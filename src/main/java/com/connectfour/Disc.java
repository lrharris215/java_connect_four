package com.connectfour;

public class Disc implements Discable {
    String color;
    char symbol;
    // saving the unicode for the symbol I want to use: '\u25C9'

    public Disc(String color, char symbol){
        this.color = color;
        this.symbol = symbol;
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
