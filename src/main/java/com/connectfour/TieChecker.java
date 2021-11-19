package com.connectfour;

public class TieChecker implements Checker{
    public boolean isGameOver(Boardable board) {
        for(Discable[] row : board.getGrid()){
            for(Discable disc : row){
                if(disc == NullDisc.getNullDisc()){
                    return false;
                }
            }
        }
        return true;
    }
}
