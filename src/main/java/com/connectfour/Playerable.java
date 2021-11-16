package com.connectfour;

public interface Playerable {
    String getName();
    Discable getDisc();
    String getDiscColor();

    int getInput(Displayable display, Boardable board);


}
