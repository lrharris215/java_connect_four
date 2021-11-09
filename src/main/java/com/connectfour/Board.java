package com.connectfour;

public class Board {
    // Board should consist of a matrix of Discs.
    Disc[][] grid;
    public Board(){
        // Standard connect-four is 6x7
        grid = new Disc[6][7];
    }

    // methods

    public void addDisc(Disc disc, int row, int col){
        // adds a disc to a location in the grid.
        grid[row][col] = disc;
    }

    public void setUpGrid() {

    }

}
