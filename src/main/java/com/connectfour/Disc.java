package com.connectfour;

public class Disc {
    String color;
    char symbol;

    public Disc(String color, char symbol){
        this.color = color;
        this.symbol = symbol;
    }

    public void printDisc(){
        // prints the char to the console. Might use toString???
        System.out.println(symbol);
    }
}
