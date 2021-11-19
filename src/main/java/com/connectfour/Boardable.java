package com.connectfour;

public interface Boardable {
    void addDisc(Discable disc, int col);
    void addDisc(Discable disc, int row, int col);
    Discable findDisc(int row, int col);
    boolean isEmpty(int row, int col);
    void setUpGrid();

    Discable[][] getGrid();
    Discable[] getRow(int row);
}
