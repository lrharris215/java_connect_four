package com.connectfour;

public interface Playerable {
    String getName();
    Discable getDisc();

    int getInput(Displayable display, Boardable board);
}
