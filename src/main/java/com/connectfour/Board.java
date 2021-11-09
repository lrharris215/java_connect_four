package com.connectfour;

public class Board {
    // Board should consist of a matrix of Discables.
    Discable[][] grid;
    public Board(){
        // Standard connect-four is 6x7
        grid = new Discable[6][7];
    }

    // methods

    public void addDisc(Discable disc, int row, int col){
        // adds a disc to a location in the grid.
        // just realized this is not how the game is played
        // TODO: Fix Board.addDisc();

        grid[row][col] = disc;
    }

    public Discable findDisc(int row, int col){
        return grid[row][col];
    }

    public void setUpGrid() {
        // initial blank state of the board.
       for(int i = 0; i < grid.length; i++){
           for(int j = 0; j < grid[0].length; j++){
               grid[i][j] = NullDisc.getNullDisc();
           }
       }
    }



}
