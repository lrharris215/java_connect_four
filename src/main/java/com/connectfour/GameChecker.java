package com.connectfour;

public class GameChecker {

    public boolean horizontalWin(Boardable board){
        // checks grid from bottom to top
        for(int row = board.getGrid().length - 1; row >= 0; row--){
            int count = 1;

            for(int col = 1; col < board.getRow(row).length; col++){
                Discable currentDisc = board.findDisc(row, col);
                Discable prevDisc =  board.findDisc(row, col - 1);

                if(currentDisc != NullDisc.getNullDisc() && currentDisc == prevDisc){
                    count += 1;
                    if (count == 4){
                        return true;
                    }
                } else {
                    count = 1;
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
