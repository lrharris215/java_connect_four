package com.connectfour;

public class GameChecker {

    public boolean horizontalWin(Boardable board){
        for(int row = board.getGrid().length - 1; row >= 0; row--){
            int count = 1;
            for(int col = 1; col < board.getRow(0).length; col++){
                if(board.findDisc(row, col) == board.findDisc(row, col - 1)){
                    count += 1;
                    if (count == 4){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean verticalWin(Boardable board){
        return false;
    }

    public boolean diagonalWin(Boardable board){
        return false;
    }

    public boolean gameOver(Boardable board){
        return false;
    }

}
