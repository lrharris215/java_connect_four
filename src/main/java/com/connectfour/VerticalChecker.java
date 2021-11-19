package com.connectfour;

public class VerticalChecker implements Checker{

    public boolean isGameOver(Boardable board) {
        for(int col = 0; col < board.getRow(0).length; col++){
            int count = 1;
            for(int row = 1; row < board.getGrid().length; row++){
                Discable currentDisc = board.findDisc(row, col);
                Discable prevDisc =  board.findDisc(row - 1, col);

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

    public boolean isTie() {
        return false;
    }
}
