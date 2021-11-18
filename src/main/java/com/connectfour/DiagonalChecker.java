package com.connectfour;

public class DiagonalChecker implements Checker{
    Validator moveValidator;

    public DiagonalChecker(Validator moveValidator){
        this.moveValidator = moveValidator;
    }
    public boolean isGameOver(Boardable board) {
        // need to check diaganols going in both directions.
        // Only certain spaces are always in a diag (Diag must cross rows 3 and 4).
        // Start at bottom, work way up. Only half the board valid in either direction.

        return isRightDiagonal(board) || isLeftDiagonal(board);
    }

    private boolean isRightDiagonal(Boardable board){
        // (-1, +1) pattern
        for(int row = board.getGrid().length - 1; row >= 0; row--){
            for(int col = 0; col < board.getRow(row).length; col++){
                Discable currentDisc = board.findDisc(row, col);
                if(currentDisc == NullDisc.getNullDisc()) {continue;}
                Discable nextDisc;
                for(int i = 1; i < 4; i++){
                    int nextRow = row - i;
                    int nextCol = col + i;

                    System.out.println("nextRow: " + nextRow);
                    System.out.println("nextCol: " + nextCol);
                    if(!moveValidator.isValid(board, nextRow, nextCol)){
                        break;
                    }else {
                        nextDisc = board.findDisc(nextRow, nextCol);
                        if(currentDisc != nextDisc){
                            break;
                        }
                        if( i == 3){
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    private boolean isLeftDiagonal(Boardable board){
        return false;
    }

}
