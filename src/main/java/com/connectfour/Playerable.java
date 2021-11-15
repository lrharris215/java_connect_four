package com.connectfour;

public interface Playerable {
    public void takeTurn(Board board, Validator validator);
    public String getName();
    public Discable getDisc();
}
