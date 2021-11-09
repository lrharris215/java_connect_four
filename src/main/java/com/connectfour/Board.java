package com.connectfour;

public class Board {
    // Board should consist of a matrix of Discs.
    Discable[][] grid;
    public Board(){
        // Standard connect-four is 6x7
        grid = new Discable[6][7];
    }

    // methods

    public void addDisc(Discable disc, int row, int col){
        // adds a disc to a location in the grid.
        // just realized this is not how the game is played. Will fix later when I get to the player adds token step.

        grid[row][col] = disc;
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
