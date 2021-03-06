package com.connectfour;

public interface Boardable {
    void addDisc(Discable disc, int col);
    void addDisc(Discable disc, int row, int col);
    void addRow(int row, Discable disc1, Discable disc2, Discable disc3, Discable disc4);

    boolean isEmpty(int row, int col);
    void setUpGrid();

    Discable findDisc(int row, int col);
    Discable[][] getGrid();
    Discable[] getRow(int row);
}
