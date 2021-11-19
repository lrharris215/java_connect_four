package com.connectfour;

public class DiagonalChecker implements Checker{
    Validator moveValidator;

    public DiagonalChecker(Validator moveValidator){
        this.moveValidator = moveValidator;
    }
    public boolean isGameOver(Boardable board) {
        // need to check diagonals going in both directions.
        // Start at bottom, work way up. Only half the board valid in either direction.

        return isRightDiagonal(board) || isLeftDiagonal(board);
    }

    private boolean isRightDiagonal(Boardable board){
        // (-1, +1) pattern
        boolean isFourInARow = false;

        for(int row = board.getGrid().length - 1; row >= 0; row--){
            for(int col = 0; col < board.getRow(row).length; col++){
                Discable currentDisc = board.findDisc(row, col);
                if(currentDisc == NullDisc.getNullDisc()) {continue;}
                Discable nextDisc;
                for(int i = 1; i < 4; i++){
                    int nextRow = row - i;
                    int nextCol = col + i;
                    if(!moveValidator.isValid(board, nextRow, nextCol)){
                        break;
                    }else {
                        nextDisc = board.findDisc(nextRow, nextCol);
                        if(currentDisc != nextDisc){
                            break;
                        }
                        if( i == 3){
                            isFourInARow =  true;
                        }
                    }
                }
            }
        }
        return isFourInARow;
    }

    private boolean isLeftDiagonal(Boardable board){
        // (-1, -1) pattern

        boolean isFourInARow =  false;

        for(int row = board.getGrid().length - 1; row >= 0; row--){
            for(int col = board.getRow(row).length - 1; col >= 0; col--){
                Discable currentDisc = board.findDisc(row, col);
                if(currentDisc == NullDisc.getNullDisc()) {continue;}
                Discable nextDisc;
                for(int i = 1; i < 4; i++){
                    int nextRow = row - i;
                    int nextCol = col - i;
                    if(!moveValidator.isValid(board, nextRow, nextCol)){
                        break;
                    }else {
                        nextDisc = board.findDisc(nextRow, nextCol);
                        if(currentDisc != nextDisc){
                            break;
                        }
                        if( i == 3){
                            isFourInARow = true;
                        }
                    }
                }
            }
        }
        return isFourInARow;
    }

    public boolean isTie() {
        return false;
    }
}
