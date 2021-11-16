package com.connectfour;

public interface Playerable {
    public void takeTurn(Displayable display, Boardable board);
    public String getName();
    public Discable getDisc();
}
