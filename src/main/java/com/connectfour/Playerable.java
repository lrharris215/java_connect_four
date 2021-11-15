package com.connectfour;

public interface Playerable {
    public void takeTurn(Displayable display, Board board);
    public String getName();
    public Discable getDisc();
}
