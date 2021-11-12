package com.connectfour;

public interface Playerable {
    public void takeTurn(Board board);
    public String getName();
    public Discable getDisc();
}
