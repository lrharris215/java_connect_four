package com.connectfour;

public class MoveValidator implements Validator{
    @Override
    public boolean isValid(Board board, int column) {
        // 0 and 6 are the limits of the board.
        // If the top of the row is empty, the column hasn't been filled yet.
        // If it isn't empty, the col is filled and the move is invalid.
        return column >= 1 && column <= 7 && board.isEmpty(0, column - 1);
    }
}
