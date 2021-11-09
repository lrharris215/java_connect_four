package com.connectfour;

public class NullDisc extends Disc{
    String color;
    char symbol;

    private NullDisc(String color, char symbol){
        super(color, symbol);
    }

    private static NullDisc nullDisc = new NullDisc("null", '\u25CC');

    public static NullDisc getNullDisc(){
        return nullDisc;
    }

}
