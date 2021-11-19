package com.connectfour;

public class TieChecker implements Checker{
    boolean isTie = false;
    public boolean isGameOver(Boardable board) {
        for(Discable[] row : board.getGrid()){
            for(Discable disc : row){
                if(disc == NullDisc.getNullDisc()){
                    return false;
                }
            }
        }
        isTie = true;
        return true;
    }

    public boolean isTie(){
        return isTie;
    }
}
