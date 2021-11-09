package com.connectfour;

public class Presenter {
    public static void printBoard(Displayable display, Board board){
        Discable disc;

        for(int i = 0; i < board.grid.length; i++){
            for(int j = 0; j < board.grid[0].length; j++){
                disc = board.grid[i][j];
                display.print("| ");
                printDisc(display, disc);
                display.print(" |");
            }
            display.print("\n");
        }
        display.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

    public static void printDisc(Displayable display, Discable disc){
        display.print(disc.getSymbol());
    }


}
