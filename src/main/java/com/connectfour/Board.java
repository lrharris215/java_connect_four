package com.connectfour;

public class Board {
    // Board should consist of a matrix of Discables.
    Discable[][] grid;
    public Board(){
        // Standard connect-four is 6x7
        grid = new Discable[6][7];
        setUpGrid();
    }

    // methods

    public void addDisc(Discable disc, int col){
        // adds a disc to a column in the grid.
        // takes in a column, needs to figure out how far down the piece goes.
        for(int row = grid.length - 1; row >= 0; row--){
            if(isEmpty(row, col)){
                grid[row][col] = disc;
                break;
            }
        }
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

    public boolean isEmpty(int row, int col){
        return grid[row][col] == NullDisc.getNullDisc();
    }




}
