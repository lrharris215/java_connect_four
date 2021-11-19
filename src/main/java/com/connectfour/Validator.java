package com.connectfour;

public interface Validator {
    boolean isValid(Boardable board, int column);

    boolean isValid(Boardable board, int row, int col);
}
