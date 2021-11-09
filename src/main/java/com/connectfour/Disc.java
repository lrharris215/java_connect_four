package com.connectfour;

public class Disc implements Discable {
    String color;
    char symbol;

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
